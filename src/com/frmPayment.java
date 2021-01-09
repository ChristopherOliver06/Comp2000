package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPayment extends JFrame{

    private JPanel PaymentForm;
    private JButton btnCard;
    private JButton btnCash;


    public frmPayment() {
        setContentPane(PaymentForm);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();


        btnCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmCardPayment paymentForm = new frmCardPayment();
                paymentForm.setVisible(true);
                setVisible(false);
            }
        });
    }
}
