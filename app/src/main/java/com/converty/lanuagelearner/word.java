package com.converty.lanuagelearner;

public class word {
    private String mdefault;
    private String mkannada;
    private int mRdrawablenumber_one;
    private int maudio;

    public word(String defaulttranslation,String kannadatranslation,int imgadress,int audioadress) {
        mdefault = defaulttranslation;
        mkannada = kannadatranslation;
        mRdrawablenumber_one=imgadress;
        maudio=audioadress;
    }
    public  String getdefault(){
        return mdefault;
    }
    public  String getKannada(){
        return mkannada;
    }
    public int getadress(){
        return mRdrawablenumber_one;
    }
    public int getaudio(){
        return maudio;
    }
}
