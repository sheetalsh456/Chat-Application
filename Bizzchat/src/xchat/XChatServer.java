package xchat;

import java.awt.Font;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class XChatServer implements Runnable {

    ServerSocket ss;
    Socket socket;

    public XChatServer() {
        try {
            String port = JOptionPane.showInputDialog("Enter Port Number [Hint:Default port = 8080]");
            if ("".equals(port)) { // if no port number entered, it assigns default value
                port = "8080";
            }
            String regex = "\\d+"; // any digit character in [0-9]
            while (true) {
                if (port.matches(regex)) {
                    if (Integer.parseInt(port) < 0 || Integer.parseInt(port) > 65535) { // check for unsigned int range
                        port = JOptionPane.showInputDialog("<html> <b>INVALID PORT</b> : Enter Port Number [Hint:Default port = 8080]</html>");
                    } else {
                        break;
                    }
                } else {
                    port = JOptionPane.showInputDialog("<html> <b>INVALID PORT</b> : Enter Port Number [Hint:Default port = 8080]</html>");
                }
            }
            int Port = Integer.parseInt(port); // casting into an integer
            this.ss = new ServerSocket(Port); // creates an object of ServerSocket
        } catch (java.lang.NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Thank you for using BizzChat");
            System.exit(4);
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "<html><br>INVALID PORT</br></html>");
        } catch (IOException ex) {
            boolean flag = true;
            while (flag) {
                JOptionPane.showMessageDialog(null, "Unable to Open Port. [Please try another Port]");
                // Enables the user to enter port number again
                String port = JOptionPane.showInputDialog("Enter Port Number"); 
                if (port == null) {
                    System.exit(4);
                }
                int Port = Integer.parseInt(port);
                try {
                    this.ss = new ServerSocket(Port);
                    flag = false;
                } catch (IOException ex1) {

                }
            }
        }
    }

    @Override
    public void run() {
        WaitingClient wclient = new WaitingClient();
        wclient.setLocation(800, 400);
        wclient.setVisible(true);
        try {
            socket = ss.accept(); 
            // establishes connection between server and client
        } catch (IOException ex) {
            // used to log messages for a particular component
            Logger.getLogger(XChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        wclient.dispose(); // causes the JFrame window to be destroyed
        // setting up the chat window and its attributes
        XChatScreen xchat = new XChatScreen("Server", socket);
        xchat.setTitle("BizzChat:Connected");
        xchat.setLocation(600, 400);
        xchat.setResizable(false);
        xchat.setVisible(true);
        new Thread(xchat).start();
    }
}
