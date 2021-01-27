package com.View;

import com.Controller.Controller;
import com.IGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class frmAddStock extends JFrame {
    private JButton btnSave;
    private JTextArea textArea1;
    private JPanel addStock;
    private Controller controller;

    public frmAddStock(Controller controller) {
        setContentPane(addStock);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();


        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = textArea1.getText();
                try {
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("resources\\Shop.txt", true)));
                    out.println(item);
                    out.close();
                } catch (IOException m) {
                    System.out.println("Couldn't get file");
                }

                frmAdminPage adminPage = new frmAdminPage(controller);
                adminPage.setVisible(true);
                setVisible(false);


            }
        });
    }
}

