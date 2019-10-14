package com.example.goldarku.Activity;

public class DonorDarah {

    private int usia, weight, tdSis, tdDis, hb;
    private String index;

    public DonorDarah(int usia, int weight, int tdSis, int tdDis, int hb) {
        this.usia = usia;
        this.weight = weight;
        this.tdSis = tdSis;
        this.tdDis = tdDis;
        this.hb = hb;
        this.index = donor();
    }

    public String getIndex() {
        return index;
    }

    public String donor() {
        String hasil="";
        if(this.usia>=17 && this.usia<=60){
            if(this.weight>=50){
                if(this.tdSis>=110 && this.tdSis<=160){
                    if(this.tdDis>=70 && this.tdDis<=100){
                        if(this.hb>=12){
                            hasil="DIPERBOLEHKAN untuk melakukan donor darah";
                        }else{
                            hasil="TIDAK DIPERBOLEHKAN untuk melakukan donor darah karena hemoglobine anda tidak memenuhi syarat";
                        }
                    }else{
                        hasil="TIDAK DIPERBOLEHKAN untuk melakukan donor darah karena tekanan darah diastole anda tidak memenuhi syarat";
                    }
                }else{
                    hasil="TIDAK DIPERBOLEHKAN untuk melakukan donor darah karena tekanan darah sistole anda tidak memenuhi syarat";
                }
            }else{
                hasil="TIDAK DIPERBOLEHKAN untuk melakukan donor darah karena berat badan anda tidak memenuhi syarat";
            }
        }else{
            hasil="TIDAK DIPERBOLEHKAN untuk melakukan donor darah karena usia anda tidak memenuhi syarat";
        }return hasil;
    }

}
