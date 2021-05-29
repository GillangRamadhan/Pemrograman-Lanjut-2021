package com.company.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FromBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FromBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                Mahasiswa mhs = new Mahasiswa();
                        mhs.setNama(nama);
                        mhs.setNim(nim);
                labelHasil.setText(
                        "Nama\t\t: " + mhs.getNama() + "\n"
                        + "NIM\t\t: " + mhs.getNim() + "\n"
                        + "Jenjang Pendidikan\t\t: " + mhs.jenjangPendidikan() + "\n"
                        + "Angkatan\t\t: " + mhs.angkatan() + "\n"
                        + "Fakultas\t\t: " + mhs.fakultas() + "\n"
                        + "Prodi\t\t: " + mhs.prodi() + "\n"
                        + "Jenis Kelamin\t\t: " + mhs.jenisKelamin() +"\n"

                );

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
