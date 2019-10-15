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
            GolAnak = "A(75) dan O(25)";
        }else if (this.GolIbu.equals("B") && this.GolAyah.equals("B")) {
            GolAnak = "B(75) dan O(25)";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("AB")) {
            GolAnak = "A(25), B(25), dan AB(50)";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("O")) {
            GolAnak = "O(100)";
        }else if(this.GolIbu.equals("A")&&this.GolAyah.equals("B")) {
            GolAnak = "A(25), B(25), AB(25), dan O(25)";
        }else if(this.GolIbu.equals("A")&&this.GolAyah.equals("AB")) {
            GolAnak = "A(50), B(25), dan AB(25)";
        }else if(this.GolIbu.equals("A")&&this.GolAyah.equals("O")) {
            GolAnak = "A(50) dan O(50)";
        }else if(this.GolIbu.equals("B")&&this.GolAyah.equals("A")) {
            GolAnak = "A(25), B(25), AB(25), dan O(25)";
        }else if(this.GolIbu.equals("B")&&this.GolAyah.equals("AB")) {
            GolAnak = "A(25), B(50), dan AB(25)";
        }else if(this.GolIbu.equals("B")&&this.GolAyah.equals("O")) {
            GolAnak = "B(50) dan O(50)";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("A")) {
            GolAnak = "A(50), B(25), dan AB(25)";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("B")) {
            GolAnak = "A(25), B(50), dan AB(25)";
        }else if(this.GolIbu.equals("AB")&&this.GolAyah.equals("O")) {
            GolAnak = "A(50) dan B(50)";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("A")) {
            GolAnak = "A(50) dan O(50)";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("B")) {
            GolAnak = "B(50) dan O(50)";
        }else if(this.GolIbu.equals("O")&&this.GolAyah.equals("AB")) {
            GolAnak = "A(50) dan B(50)";
        }else{
            GolAnak = "- (Inputan Tidak Valid!)";
        }
        return GolAnak;
    }
}
