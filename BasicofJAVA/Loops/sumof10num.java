package com.suryansh.BasicofJAVA.Loops;
import  java.util.Scanner;
public class sumof10num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sum of First 10 Numbers


        //using for loops

        int sum = 0 ;

        for (int i = 0 ; i<= 10 ; i++) {
            sum = sum + i ;


        }
        System.out.println(sum);

        //using while loops

        int su = 0 ;
        int j = 0;

        while(j<=10){
            su = su + j;
            j++;
        }
        System.out.println(su);

        // do while loops

    }
}
