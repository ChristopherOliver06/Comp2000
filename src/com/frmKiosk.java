package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmKiosk extends JFrame {
    private JButton adminLoginButton;
    private JPanel kioskPanel;
    private JButton payNowButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public frmKiosk() {
            setContentPane(kioskPanel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setPreferredSize(new Dimension(500,500));
            pack();

        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frmAdmin adminForm = new frmAdmin();
               adminForm.setVisible(true);
               setVisible(false);

            }
        });
        payNowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmPayment paymentSelect = new frmPayment();
                paymentSelect.setVisible(true);
                setVisible(false);
            }
        });
    }
}

