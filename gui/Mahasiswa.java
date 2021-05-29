package com.company.gui;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1(Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2(Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3(Doktor)";
        }
        return "error";
    }
    public String angkatan() {
        if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("21")) {
            return "2021";
        }else {
            return "error";
        }
    }
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Sains dan Teknologi";
        }else if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Ushuluddin";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas Syari'ah dan Hukum";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Tarbiyah dan Keguruan";
        }else {
            return "error";
        }
    }
    public String prodi() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Prodi Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Prodi Matematika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Industri";
        }
        return "error";
    }
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "error";
    }

}
