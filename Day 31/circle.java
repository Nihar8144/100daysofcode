package com.nihar;
public class circle extends shape {
    circle(int dimen1){
        super(dimen1, -1);
    }
    public double area(){
        return Math.PI * this.dimen1 * this.dimen1;
    }
}
