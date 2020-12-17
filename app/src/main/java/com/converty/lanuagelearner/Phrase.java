package com.converty.lanuagelearner;

public class Phrase {
     private String mkannada;
    private String mdefault;
    private int maudio;
    public Phrase(String kannada,String defaulted,int audio){
        mkannada=kannada;
        mdefault=defaulted;
        maudio=audio;
    }
    public String getkannadaphrase(){
        return mkannada;
    }
    public String getdefaultphrase(){
        return mdefault;
    }
    public int getaudio(){
        return maudio;
    }
}
