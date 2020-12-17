package com.converty.lanuagelearner;

public class Family {
     private String mkannada;
    private String mdefault;
    private int mimgadress;
    private int maudio;
    public Family(String kannada,String defaulted,int imgadress,int audio){
        mkannada=kannada;
        mdefault=defaulted;
        mimgadress=imgadress;
        maudio=audio;
    }
    public String getkanada(){
        return mkannada;
    }
    public String getdefault1(){
        return mdefault;
    }
    public int getadress(){
        return mimgadress;
    }
    public int getaudio(){
        return maudio;
    }
}
