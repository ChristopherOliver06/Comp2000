package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAdmin extends JFrame {
    private JButton btnCancel;
    private JButton btnLogin;
    private JTextField textField1;
    private JTextField textField2;
    public JPanel adminPanel;


    public frmAdmin() {
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
        frmAdmin page = new frmAdmin();
        page.setVisible(true);
    }







}

