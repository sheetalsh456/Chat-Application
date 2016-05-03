package xchat;

import java.io.IOException;
import java.net.Socket;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class XChatClient {

    Socket socket;
    String IPv4;
    int Port;
    // Regular expression to check validity of format of IP Address
    private static final Pattern IPv4c = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    XChatClient() {
        IPv4 = JOptionPane.showInputDialog("Enter IP address of the Server");
        try {
            while (!IPv4c.matcher(IPv4).matches()) {
                IPv4 = JOptionPane.showInputDialog("ERROR:Try Again. Enter IP address of the Server");
            }
            if (IPv4 == null) {
                JOptionPane.showMessageDialog(null, "Thank you for using BizzChat");
                System.exit(4);
            }

            String port = JOptionPane.showInputDialog("Enter the Port Number [Hint:Default port = 8080]");
            if ("".equals(port)) // set default port number
            {
                port = "8080";
            }
            //check for validity of port number 
            String regex = "\\d+";
            while (true) {
                if (port.matches(regex)) {
                    if (Integer.parseInt(port) < 0 || Integer.parseInt(port) > 65535) {
                        port = JOptionPane.showInputDialog("<html> <b>INVALID PORT</b> : Enter Port Number [Hint:Default port = 8080]</html>");
                    } else {
                        break;
                    }
                } else {
                    port = JOptionPane.showInputDialog("<html> <b>INVALID PORT</b> : Enter Port Number [Hint:Default port = 8080]</html>");
                }
            }
            Port = Integer.parseInt(port);
        } catch (java.lang.NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Thank you for using BizzChat");
            System.exit(4);
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Thank you for using BizzChat");
            System.exit(4);
        }
        try {
            // causes connection between this client and the server
            socket = new Socket(IPv4, Port);
        } catch (java.lang.NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Thank you for using BizzChat"
                    + ""
                    + ""
                    + "");
            System.exit(4);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Open Socket. [Hint: Please ensure the Server is on and running.]");
            System.exit(3);
        }
        //opens another XChat window and sets its attributes
        XChatScreen xchat = new XChatScreen("Client", socket);
        xchat.setTitle("BizzChat:Connected");
        xchat.setLocation(600, 400);
        xchat.setResizable(false);
        xchat.setVisible(true);
        new Thread(xchat).start();
    }
}
