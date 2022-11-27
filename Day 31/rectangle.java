package com.nihar;
public class rectangle extends shape {
    private int dimen1;
    private int dimen2;
    rectangle(int dimen1,int dimen2){
        super(dimen1,dimen2);
    }
    public int area(){
        return this.dimen1*this.dimen2;
    }
}
