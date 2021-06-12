package com.company.gui.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleTable1 {
    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textHp;
    private JButton buttonSave;
    private JTable tableBiodata;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExampleTable1() {
        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textName.getText();
                String email = textEmail.getText();
                String hp = textHp.getText();
                if(nama.isBlank() || email.isBlank() || hp.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "EROR",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    tableModel.addRow(new Object[]{nama, email, hp});
                    //clear textfields
                    textName.setText("");
                    textEmail.setText("");
                    textHp.setText("");
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Nama",
                "Email",
                "HP"
        };
        Object[][] initData = {
                {"Gilang Ramadhan", "12050113045@students.uin-suska.ac.id", "081378408175"},
                {"UNKNOWN", "UNKNOWN@email.com", "081378408175"},
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableBiodata.setModel(tableModel);
        //menampilkan sorting di setiap colom
        tableBiodata.setAutoCreateRowSorter(true);
        // enable single selection
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
