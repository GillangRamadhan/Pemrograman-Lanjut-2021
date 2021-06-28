package com.company.gui.UAS;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleTable1 {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textEmail;
    private JTextField textHP;
    private JButton buttonSave;
    private JTable tableBiodata;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExampleTable1() {
        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String email = textEmail.getText();
                String hp = textHP.getText();

                if(nama.isBlank() || email.isBlank() || hp.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "ERROR (data not complete)",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    tableModel.addRow(new Object[]{nama, email, hp});
                    textNama.setText("");
                    textEmail.setText("");
                    textHP.setText("");
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom= {
                "Nama",
                "Email",
                "HP"
        };
        Object[][] initData = {
                {"Gilang", "gilang@gmail.com", "081378408175"}

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tableBiodata.setModel(tableModel);
        tableBiodata.setAutoCreateRowSorter(true);
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
