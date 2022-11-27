package com.nihar;
public class square extends shape {
    private int dimen1;
    square(int dimen1){
        super(dimen1, -1);
    }
    public int area(){
        return this.dimen1*this.dimen1;
    }
}