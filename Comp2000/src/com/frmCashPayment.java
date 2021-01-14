package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class frmCashPayment extends JFrame{
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
    private JLabel cashTotal;


    public frmCashPayment() {
        setContentPane(cashPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();


        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmPayment paymentSelect = new frmPayment();
                paymentSelect.setVisible(true);
                setVisible(false);
            }
        });

        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        btn1p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });

    }
}
