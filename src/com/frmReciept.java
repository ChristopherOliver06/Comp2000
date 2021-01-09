package com;

import javax.swing.*;
import java.awt.*;

public class frmReciept extends JFrame {
    private JButton btnYes;
    private JPanel recieptPanel;
    private JLabel lblReciept;
    private JButton btnNo;

    public frmReciept() {
        setContentPane(recieptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        pack();


    }

}
