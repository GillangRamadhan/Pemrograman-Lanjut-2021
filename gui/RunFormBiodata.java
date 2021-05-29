package com.company.gui;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Biodata");
        jFrame.setContentPane(new FromBiodata().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 500);
        jFrame.setVisible(true);
    }
}
