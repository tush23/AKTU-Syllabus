package com.example.chandan.Ni_Use;

/**
 * Created by Chandan on 7/21/2017.
 */

public class Myclass {

    public String msubject;
    public String munits;

    public Myclass(String subject,String units){
        msubject=subject;
        munits= units;
    }
    public String getMbranch(){
        return msubject;}
    public String getMunits(){
        return munits;
    }
}
