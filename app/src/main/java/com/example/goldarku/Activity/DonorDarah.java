package com.example.goldarku.Activity;

public class DonorDarah {

    private int usia, weight, tdDis, tdSis, hb;
    private String index;

    public DonorDarah(int usia, int weight, int tdDis, int tdSis, int hb, String index) {
        this.usia = usia;
        this.weight = weight;
        this.tdDis = tdDis;
        this.tdSis = tdSis;
        this.hb = hb;
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public String donor() {
        String hasil="";
        if(this.usia>=17 || this.usia<=60){
            if(this.weight>=50){
                if(this.tdDis>=70 && this.tdDis<=100){
                    if(this.tdSis>=110 && this.tdSis<=160){
                        if(this.hb>=12){
                            hasil="Anda DIPERBOLEHKAN untuk melakukan Donor Darah";
                        }
                    }
                }
            }
        }else{
            hasil="Anda TIDAK DIPERBOLEHKAN melakukan Donor Darah";
        }return hasil;
    }

}
