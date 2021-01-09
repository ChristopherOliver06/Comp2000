package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmCardPayment extends JFrame{
    private JButton CONFIRMPAYMENTButton;
    private JPanel CardPayment;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton btnGoBack;

    public frmCardPayment() {
        setContentPane(CardPayment);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();


        CONFIRMPAYMENTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmReciept Reciept = new frmReciept();
                Reciept.setVisible(true);
                setVisible(false);
            }
        });
    }
}
