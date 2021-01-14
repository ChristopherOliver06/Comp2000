package com.View;


import com.Controller.Controller;
import com.Model.Stock;
import com.frmAdminLogin;
import com.frmPayment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmKiosk extends JFrame {
    private JButton adminLoginButton;
    private JPanel kioskPanel;
    private JButton payNowButton;
    private JButton btnPay;
    private JButton btnSubmit;
    private JTextField barcodeField;
    private JLabel lblTotalPrice;
    private JTextArea txtBasket;
    private Controller controller;

    public frmKiosk() {
        setContentPane(kioskPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();

        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmAdminLogin adminForm = new frmAdminLogin();
                adminForm.setVisible(true);
                setVisible(false);

            }
        });
        btnPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmPayment paymentSelect = new frmPayment();
                paymentSelect.setVisible(true);
                setVisible(false);
            }
        });
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.stockFetcher(Integer.parseInt(barcodeField.getText()));
                try {
                    int barcode = Integer.parseInt(barcodeField.getText());
                    Stock stock = controller.stockFetcher(barcode);

                    if (stock != null) {
                        txtBasket.append(stock.getReciept() + "\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please input a valid barcode");
                    }
                } catch (Exception d) {
                    JOptionPane.showMessageDialog(null, "Please input a valid barcode");
                }

            }

        });

    }

    public void setController(Controller controller) {
        this.controller = controller;

    }
}