package com.suryansh.BasicofJAVA;

public class simpleIntrest {
    public static void main(String[] args) {

        int principal , rate , time , simpleIntrest ;

        principal = 100;
        rate = 10;
        time =  2;

        simpleIntrest = (principal*rate*time)/100;

        System.out.println("simple intrest of given values is " + simpleIntrest);
    }
}
