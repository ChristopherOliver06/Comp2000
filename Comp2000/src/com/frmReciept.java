package com;

import com.View.frmKiosk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Calendar;
import java.util.Date;


public class frmReciept extends JFrame {

    private JPanel ReciptPage;
    private JButton btnFinish;
    private JTextArea txtReciept;
    private JButton btnReiciept;


    public frmReciept() {
        setContentPane(ReciptPage);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();




            btnReiciept.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    txtReciept.setText("Company Name");
                    txtReciept.setText("Thank you for shopping with us today");

                }
            });

        btnFinish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmKiosk Kiosk = new frmKiosk();
                Kiosk.setVisible(true);
                setVisible(false);
            }
        });
    }


}
