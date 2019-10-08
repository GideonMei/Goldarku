package com.example.goldarku.Activity;

public class PrediksiGoldar {

    private String GolIbu;
    private String GolAyah;
    private String Index;

    public PrediksiGoldar(String GolIbu, String GolAyah){
        this.GolIbu = GolIbu;
        this.GolAyah = GolAyah;
        this.Index = prediksi();
    }

    public  String getIndex(){
        return Index;
    }


    public String prediksi() {
        String GolAnak="";
        if (this.GolIbu.equals("A") && this.GolAyah.equals("A")) {
            GolAnak = "A atau O";
        }else if (this.GolIbu.equals("B") && this.GolAyah.equals("B")) {
            GolAnak = "B atau O";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("AB")) {
            GolAnak = "A, B, atau AB";
        }else if(this.GolIbu.equals("0")&&this.GolAyah.equals("O")) {
            GolAnak = "O";
        }else if(this.GolIbu.equals("A")&&this.GolAyah.equals("B")) {
            GolAnak = "A, B, AB, atau O";
        }else if(this.GolIbu.equals("A")&&this.GolAyah.equals("AB")) {
            GolAnak = "A, B, atau AB";
        }else if(this.GolIbu.equals("A")&&this.GolAyah.equals("O")) {
            GolAnak = "A atau O";
        }else if(this.GolIbu.equals("B")&&this.GolAyah.equals("A")) {
            GolAnak = "A, B, AB, atau O";
        }else if(this.GolIbu.equals("B")&&this.GolAyah.equals("AB")) {
            GolAnak = "A, B, atau AB";
        }else if(this.GolIbu.equals("B")&&this.GolAyah.equals("O")) {
            GolAnak = "B atau O";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("A")) {
            GolAnak = "A, B, atau AB";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("B")) {
            GolAnak = "A, B, atau AB";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("O")) {
            GolAnak = "A atau B";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("A")) {
            GolAnak = "A atau O";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("B")) {
            GolAnak = "B atau O";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("AB")) {
            GolAnak = "A atau B";
        }else{
            GolAnak = "Golongan Darah yang anda masukkan SALAH !!!";
        }
        return GolAnak;
    }
}
