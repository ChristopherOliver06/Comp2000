package com;

import com.View.frmKiosk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAdminLogin extends JFrame {
    private JButton btnCancel;
    private JButton btnLogin;
    private JTextField textField1;
    private JTextField textField2;
    public JPanel adminPanel;


    public frmAdminLogin() {
        setContentPane(adminPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();


        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmKiosk Kiosk = new frmKiosk();
                Kiosk.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args)
    {
        frmAdminLogin page = new frmAdminLogin();
        page.setVisible(true);
    }







}

