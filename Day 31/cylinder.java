package com.nihar;
public class cylinder extends shape {
    private int dimen1;
    private int dimen2;
    cylinder(int dimen1,int dimen2){
        super(dimen1,dimen2);
    }
    public double area(){
        return 2*Math.PI *this.dimen1*(this.dimen2 + this.dimen1);
    }
}