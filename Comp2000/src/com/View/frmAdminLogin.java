package com.View;

import com.Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAdminLogin extends JFrame {
    private JButton btnCancel;
    private JButton btnLogin;
    private JTextField txtPassword;
    private JTextField txtUsername;
    public JPanel adminPanel;
    private Controller controller;

    public frmAdminLogin(Controller controller) {
        setContentPane(adminPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();
        this.controller = controller;

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmKiosk Kiosk = new frmKiosk();
                Kiosk.setVisible(true);
                setVisible(false);
                Kiosk.setController(controller);
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = txtPassword.getText();

                if(username.equals("admin") & password.equals("admin")){
                    frmAdminPage adminPage = new frmAdminPage(controller);
                    adminPage.setVisible(true);
                    setVisible(false);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password.");
                }
            }
        });
    }


}

