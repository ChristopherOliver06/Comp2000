package com.View;


import com.Controller.Controller;
import com.IGui;
import com.Model.Stock;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class frmKiosk extends JFrame implements IGui {
    private JButton adminLoginButton;
    private JPanel kioskPanel;
    private JButton payNowButton;
    private JButton btnPay;
    private JButton btnSubmit;
    private JTextField barcodeField;
    private JLabel lblTotalPrice;
    private JTextArea txtBasket;
    private Controller controller;
    private float Price = 0;
    private ArrayList<Stock> Trolley = new ArrayList();


    public frmKiosk() {
        setContentPane(kioskPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();

        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmAdminLogin adminForm = new frmAdminLogin(controller);
                adminForm.setVisible(true);
                setVisible(false);

            }
        });
        btnPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmPayment paymentSelect = new frmPayment(Trolley);
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
                        Price += stock.getStockPrice();
                        lblTotalPrice.setText("£" + Price);
                        Trolley.add(stock);
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
    public void update (DefaultTableModel Model){


    }
}