package com.View;

import com.Controller.Controller;
import com.IGui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAdminPage extends JFrame implements IGui {
    private JPanel stockForm;
    private JButton updateStock;
    private JTable stockTable;
    private JButton addNewStock;
    private JButton BACKTOKIOSKButton;
    private Controller controller;

    public frmAdminPage(Controller controller) {
        setContentPane(stockForm);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();
        this.controller = controller;


        BACKTOKIOSKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmKiosk Kiosk = new frmKiosk();
                Kiosk.setVisible(true);
                setVisible(false);
                Kiosk.setController(controller);
            }
        });
        addNewStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmAddStock stockAdd = new frmAddStock(controller);
                stockAdd.setVisible(true);
                setVisible(false);

            }
        });
    }

    public void update(DefaultTableModel model) {
        stockTable.setModel(model);

    }

}

