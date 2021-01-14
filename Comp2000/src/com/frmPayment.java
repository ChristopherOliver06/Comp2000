package com;

import com.View.frmKiosk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPayment extends JFrame{

    private JPanel PaymentForm;
    private JButton btnCard;
    private JButton btnCash;
    private JButton btnBack;


    public frmPayment() {
        setContentPane(PaymentForm);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();


        btnCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmCardPayment cardForm = new frmCardPayment();
                cardForm.setVisible(true);
                setVisible(false);
            }
        });
        btnCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmCashPayment cashForm = new frmCashPayment();
                cashForm.setVisible(true);
                setVisible(false);


            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmKiosk Kiosk = new frmKiosk();
                Kiosk.setVisible(true);
                setVisible(false);
            }
        });
    }
}
