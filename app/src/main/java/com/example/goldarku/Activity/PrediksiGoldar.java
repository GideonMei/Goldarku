package com.example.goldarku.Activity;

public class PrediksiGoldar {

    private String GolIbu;
    private String GolAyah;
    private String GolAnak;
    private String A,B,AB,O;

    public PrediksiGoldar(String GolIbu, String GolAyah, String GolAnak){
        this.GolIbu = GolIbu;
        this.GolAyah = GolAyah;
        this.GolAnak = GolAnak;
    }

    public String getGolAnak() {
        return GolAnak;
    }

    private String prediksi() {
        if (GolIbu == "A" && GolAyah == "A") {
            GolAnak = "A";
        }else if (GolIbu == "B" && GolAyah == "B") {
            GolAnak = "B";
        }else if(GolIbu=="AB"&&GolAyah=="AB") {
            GolAnak = "A, B, AB";
        }else if(GolIbu=="O"&&GolAyah=="O") {
            GolAnak = "O";
        }
        return GolAnak;
    }
}
