package xchat;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Options extends javax.swing.JFrame implements Serializable {

    String MY_NAME;
    public Color bg_color;
    public Color font_color;
    public Font font;
    String font_style;
    int font_size;
    Boolean notification;
    public String path_save_chat;
    public String path_save_download;
    public File imgsrc;
    public JLabel profilePicture;

    public XChatScreen xchat;

    public Options() {
        initComponents();
    }

    public Options(XChatScreen xchat) {
        this.xchat = xchat;

        MY_NAME = xchat.my_name;
        bg_color = Color.WHITE;

        font_color = Color.BLACK;
        notification = true;
        font_style = "Arial";
        font_size = 13;
        path_save_download = "D:\\";
        path_save_chat = "D:\\";

        initComponents();
        jLabel2.setSize(pro_pic_display.getWidth(), pro_pic_display.getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ProfileTab = new javax.swing.JPanel();
        pro_pic_label = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        ChooseImage = new javax.swing.JButton();
        pro_pic_display = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GeneralTab = new javax.swing.JPanel();
        Display_button = new javax.swing.JLabel();
        color_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        font_style_list = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        font_size_list = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        DisplayArea_text = new javax.swing.JTextArea();
        Font_size_label = new javax.swing.JLabel();
        Font_label = new javax.swing.JLabel();
        Font_Color_button = new javax.swing.JButton();
        ChatsTab = new javax.swing.JPanel();
        Backup_Button = new javax.swing.JLabel();
        Backup_textfield = new javax.swing.JTextField();
        backup_folder_button = new javax.swing.JButton();
        Backup_Chat_label = new javax.swing.JLabel();
        backup_chat_button = new javax.swing.JButton();
        NotificationsTab = new javax.swing.JPanel();
        Sound = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Download_Textfield = new javax.swing.JTextField();
        Download_button = new javax.swing.JButton();
        AboutTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cancel_button = new javax.swing.JButton();
        Save_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pro_pic_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pro_pic_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pro_pic_label.setText("Profile Picture");

        name_text.setText(xchat.my_name);
        name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Name");

        ChooseImage.setText("Choose Image");
        ChooseImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChooseImageMouseClicked(evt);
            }
        });
        ChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pro_pic_displayLayout = new javax.swing.GroupLayout(pro_pic_display);
        pro_pic_display.setLayout(pro_pic_displayLayout);
        pro_pic_displayLayout.setHorizontalGroup(
            pro_pic_displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pro_pic_displayLayout.setVerticalGroup(
            pro_pic_displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ProfileTabLayout = new javax.swing.GroupLayout(ProfileTab);
        ProfileTab.setLayout(ProfileTabLayout);
        ProfileTabLayout.setHorizontalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ProfileTabLayout.createSequentialGroup()
                        .addComponent(pro_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pro_pic_display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileTabLayout.createSequentialGroup()
                        .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        ProfileTabLayout.setVerticalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileTabLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_pic_display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", ProfileTab);

        Display_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Display_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_button.setText("Display");

        color_button.setText("Background Color");
        color_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_buttonActionPerformed(evt);
            }
        });

        font_style_list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Arial", "Bradley Hand ITC", "Castellar", "Chiller", "Comic Sans MS", "Courier New", "Lucida Calligraphy", "Papyrus", "Tahoma", "Times New Roman" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        font_style_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        font_style_list.setSelectedIndex(0);
        font_style_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                font_style_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(font_style_list);
        font_style_list.setSelectedIndex(0);

        font_size_list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "very small", "small", "medium", "huge", "vey huge" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        font_size_list.setSelectedIndex(1);
        font_size_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                font_size_listValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(font_size_list);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        DisplayArea_text.setEditable(false);
        DisplayArea_text.setColumns(20);
        DisplayArea_text.setRows(5);
        DisplayArea_text.setText("AaBbYyZz");
        DisplayArea_text.setAutoscrolls(false);
        DisplayArea_text.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(DisplayArea_text);

        Font_size_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Font_size_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Font_size_label.setText("Font size");

        Font_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Font_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Font_label.setText("Font ");

        Font_Color_button.setText("Font Color");
        Font_Color_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Font_Color_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GeneralTabLayout = new javax.swing.GroupLayout(GeneralTab);
        GeneralTab.setLayout(GeneralTabLayout);
        GeneralTabLayout.setHorizontalGroup(
            GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color_button, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(Display_button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Font_Color_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeneralTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GeneralTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Font_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Font_size_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        GeneralTabLayout.setVerticalGroup(
            GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeneralTabLayout.createSequentialGroup()
                        .addComponent(Font_size_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GeneralTabLayout.createSequentialGroup()
                        .addComponent(Font_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(GeneralTabLayout.createSequentialGroup()
                                .addComponent(color_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Font_Color_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(GeneralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General", GeneralTab);

        Backup_Button.setText("Backup Folder");

        Backup_textfield.setText(xchat.path_save_chat);
        Backup_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Backup_textfieldActionPerformed(evt);
            }
        });

        backup_folder_button.setText("Choose Folder");
        backup_folder_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backup_folder_buttonActionPerformed(evt);
            }
        });

        Backup_Chat_label.setText("Backup Current Chat");

        backup_chat_button.setText("OK");
        backup_chat_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backup_chat_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChatsTabLayout = new javax.swing.GroupLayout(ChatsTab);
        ChatsTab.setLayout(ChatsTabLayout);
        ChatsTabLayout.setHorizontalGroup(
            ChatsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatsTabLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(ChatsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Backup_Chat_label, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(Backup_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Backup_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(backup_folder_button, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(ChatsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ChatsTabLayout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(backup_chat_button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );
        ChatsTabLayout.setVerticalGroup(
            ChatsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatsTabLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(ChatsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Backup_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backup_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backup_folder_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Backup_Chat_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(ChatsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChatsTabLayout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(backup_chat_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );

        jTabbedPane1.addTab("Chats ", ChatsTab);

        Sound.setSelected(true);
        Sound.setText("Sound");
        Sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundActionPerformed(evt);
            }
        });

        jLabel1.setText("Download Folder");

        Download_Textfield.setEditable(false);
        Download_Textfield.setText(xchat.path_save_download);

        Download_button.setText("Choose Folder");
        Download_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Download_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NotificationsTabLayout = new javax.swing.GroupLayout(NotificationsTab);
        NotificationsTab.setLayout(NotificationsTabLayout);
        NotificationsTabLayout.setHorizontalGroup(
            NotificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificationsTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(NotificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotificationsTabLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Download_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Download_button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sound, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        NotificationsTabLayout.setVerticalGroup(
            NotificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificationsTabLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Sound, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Download_button, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Download_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sounds & Download", NotificationsTab);

        AboutTab.setAutoscrolls(true);
        AboutTab.setEnabled(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("BizzChat is a convenient way of communicating with people across the world. It makes life simpler and includes provisions for image,file,audio and video transfers, profile image uploading and keeps backup as well, for future use. ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout AboutTabLayout = new javax.swing.GroupLayout(AboutTab);
        AboutTab.setLayout(AboutTabLayout);
        AboutTabLayout.setHorizontalGroup(
            AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );
        AboutTabLayout.setVerticalGroup(
            AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutTabLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", AboutTab);

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        Save_Exit.setText("Save and Exit");
        Save_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Save_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancel_button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Save_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textActionPerformed

    }//GEN-LAST:event_name_textActionPerformed

    private void color_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_buttonActionPerformed
        Color initialcolor = Color.WHITE;
        bg_color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        DisplayArea_text.setBackground(bg_color);
    }//GEN-LAST:event_color_buttonActionPerformed

    private void ChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseImageActionPerformed
        JFileChooser chooseImage = new JFileChooser();
        chooseImage.showOpenDialog(this);
        imgsrc = chooseImage.getSelectedFile();
        profilePicture = new JLabel();
        try {
            BufferedImage image = ImageIO.read(imgsrc);
            Image resized = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            jLabel2.setIcon(new ImageIcon(resized));
            pro_pic_display.setVisible(true);
        } catch (IOException ex) {

        }
        this.repaint();
    }//GEN-LAST:event_ChooseImageActionPerformed

    private void Backup_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Backup_textfieldActionPerformed
    }//GEN-LAST:event_Backup_textfieldActionPerformed

    private void Save_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ExitActionPerformed
        MY_NAME = name_text.getText().trim();
        if (MY_NAME != null) {
            xchat.my_name = MY_NAME;
            xchat.change_name();
        }
        xchat.setChatTheme(bg_color);
        xchat.setChatFont(font);
        xchat.setFontColor(font_color);
        if (path_save_download != null) {
            xchat.setDownloadPath(path_save_download);
        }
        if (path_save_chat != null) {
            xchat.setBackupPath(path_save_chat);
        }
        xchat.notification = notification;
        this.dispose();
        if (imgsrc != null) {
            xchat.sendImage(imgsrc);
        }
    }//GEN-LAST:event_Save_ExitActionPerformed

    private void ChooseImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChooseImageMouseClicked

    }//GEN-LAST:event_ChooseImageMouseClicked

    private void backup_folder_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backup_folder_buttonActionPerformed
        try {
            JFileChooser sel = new JFileChooser();
            sel.setCurrentDirectory(new java.io.File("."));
            sel.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            sel.setAcceptAllFileFilterUsed(false);
            if (sel.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File selFile = sel.getSelectedFile();
                Backup_textfield.setText(selFile.getCanonicalPath());
                path_save_chat = selFile.getCanonicalPath() + "\\";
            } else {
                 //do nothing
            }
        } catch (IOException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backup_folder_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void font_style_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_font_style_listValueChanged
        font_style = font_style_list.getSelectedValue().toString();
        font = new Font(font_style, Font.PLAIN, font_size);
        DisplayArea_text.setFont(font);
    }//GEN-LAST:event_font_style_listValueChanged

    private void font_size_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_font_size_listValueChanged
        int i = font_size_list.getSelectedIndex();

        switch (i) {
            case 0:
                font_size = 11;
                break;
            case 1:
                font_size = 15;
                break;
            case 2:
                font_size = 19;
                break;
            case 3:
                font_size = 21;
                break;
            case 4:
                font_size = 23;
                break;
        }
        font = new Font(font_style, Font.PLAIN, font_size);
        DisplayArea_text.setFont(font);
    }//GEN-LAST:event_font_size_listValueChanged

    private void Font_Color_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Font_Color_buttonActionPerformed
        Color initialcolor = Color.BLACK;
        font_color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        DisplayArea_text.setForeground(font_color);
    }//GEN-LAST:event_Font_Color_buttonActionPerformed

    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
        notification = Sound.isSelected();
    }//GEN-LAST:event_SoundActionPerformed

    private void Download_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Download_buttonActionPerformed
        try {
            JFileChooser sel = new JFileChooser();

            sel.setCurrentDirectory(new java.io.File("."));
            sel.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            sel.setAcceptAllFileFilterUsed(false);
            if (sel.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File selFile = sel.getSelectedFile();
                Download_Textfield.setText(selFile.getCanonicalPath());
                path_save_download = selFile.getCanonicalPath();
            } else {
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_Download_buttonActionPerformed

    private void backup_chat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backup_chat_buttonActionPerformed
        xchat.backup();
    }//GEN-LAST:event_backup_chat_buttonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private transient javax.swing.JPanel AboutTab;
    private transient javax.swing.JLabel Backup_Button;
    private transient javax.swing.JLabel Backup_Chat_label;
    private transient javax.swing.JTextField Backup_textfield;
    private transient javax.swing.JPanel ChatsTab;
    private transient javax.swing.JButton ChooseImage;
    private transient javax.swing.JTextArea DisplayArea_text;
    private transient javax.swing.JLabel Display_button;
    private transient javax.swing.JTextField Download_Textfield;
    private transient javax.swing.JButton Download_button;
    private transient javax.swing.JButton Font_Color_button;
    private transient javax.swing.JLabel Font_label;
    private transient javax.swing.JLabel Font_size_label;
    private transient javax.swing.JPanel GeneralTab;
    private transient javax.swing.JPanel NotificationsTab;
    private transient javax.swing.JPanel ProfileTab;
    private transient javax.swing.JButton Save_Exit;
    private transient javax.swing.JCheckBox Sound;
    private transient javax.swing.JButton backup_chat_button;
    private transient javax.swing.JButton backup_folder_button;
    private transient javax.swing.JButton cancel_button;
    private transient javax.swing.JButton color_button;
    private transient javax.swing.JList font_size_list;
    private transient javax.swing.JList font_style_list;
    private transient javax.swing.JLabel jLabel1;
    private transient javax.swing.JLabel jLabel2;
    private transient javax.swing.JScrollPane jScrollPane1;
    private transient javax.swing.JScrollPane jScrollPane2;
    private transient javax.swing.JScrollPane jScrollPane3;
    private transient javax.swing.JScrollPane jScrollPane4;
    private transient javax.swing.JTabbedPane jTabbedPane1;
    private transient javax.swing.JTextArea jTextArea1;
    private transient javax.swing.JLabel name_label;
    private transient javax.swing.JTextField name_text;
    private transient javax.swing.JPanel pro_pic_display;
    private transient javax.swing.JLabel pro_pic_label;
    // End of variables declaration//GEN-END:variables
}
