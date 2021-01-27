package com.View;

import com.Model.Stock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class frmCashPayment extends JFrame {
    private JButton btn20Pound;
    private JPanel cashPanel;
    private JButton btn5Pound;
    private JButton btn1Pound;
    private JButton btn20p;
    private JButton btn10p;
    private JButton btn50p;
    private JButton btn2Pound;
    private JButton btn10Pound;
    private JButton btn50Pound;
    private JButton btnConfirm;
    private JButton btnGoBack;
    private JButton btn5p;
    private JButton btn2p;
    private JButton btn1p;
    private JLabel totalCashAdded;
    private JLabel lblTotalCash;
    private ArrayList<Stock> Trolley = new ArrayList();
    private float totalPrice = 0;

    public frmCashPayment(ArrayList Trolley) {
        setContentPane(cashPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();
        this.Trolley = Trolley;
        calculateTotal();
        lblTotalCash.setText("£" + totalPrice);

        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmPayment paymentSelect = new frmPayment(Trolley);
                paymentSelect.setVisible(true);
                setVisible(false);
            }
        });


        btn1p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frmReciept recieptPage = new frmReciept();
                recieptPage.setVisible(true);
                setVisible(false);
            }
        });
    }

    private void calculateTotal() {
        for (int i = 0; i < Trolley.size(); i++) {
            totalPrice += Trolley.get(i).getStockPrice();
        }

    }
}