package com.converty.lanuagelearner;

public class Colour {
    private String mkannada;
    private String mdefault;
    private int madress;
    private int maudio;
    public Colour(String kannada,String defaulted,int imgadress,int audio){
        mkannada=kannada;
        mdefault=defaulted;
        madress=imgadress;
        maudio=audio;
    }
    public String getkanadacol(){
        return mkannada;
    }
    public String getdefaultcol(){
        return mdefault;
    }
    public int getadress(){
        return madress;
    }
    public int getaudio(){
        return maudio;
    }
}
