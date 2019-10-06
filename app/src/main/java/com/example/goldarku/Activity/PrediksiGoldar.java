package com.example.goldarku.Activity;

public class PrediksiGoldar {

    private String GolIbu;
    private String GolAyah;
    private String GolAnak;

    public PrediksiGoldar(String GolIbu, String GolAyah){
        this.GolIbu = GolIbu;
        this.GolAyah = GolAyah;
        this.GolAnak = prediksi();
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
        }return getGolAnak();
    }
}
