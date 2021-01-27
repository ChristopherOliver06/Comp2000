package com.View;

import com.Model.Stock;
import com.View.frmCardPayment;
import com.View.frmCashPayment;
import com.View.frmKiosk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class frmPayment extends JFrame{

    private JPanel PaymentForm;
    private JButton btnCard;
    private JButton btnCash;
    private JButton btnBack;
    private ArrayList<Stock> Trolley = new ArrayList();

    public frmPayment(ArrayList Trolley) {
        setContentPane(PaymentForm);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();
        this.Trolley = Trolley;

        btnCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmCardPayment cardForm = new frmCardPayment(Trolley);
                cardForm.setVisible(true);
                setVisible(false);
            }
        });
        btnCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmCashPayment cashForm = new frmCashPayment(Trolley);
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
