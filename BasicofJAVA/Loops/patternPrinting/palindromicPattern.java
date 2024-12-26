package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class palindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<= 5 ; i++){
            for(int s = 1 ; s<=5-i ; s++){
                System.out.print(" ");
            }
            for(int j = i ; j>= 1 ;j--){
                System.out.print(j);
                //System.out.print(" ");
            }
            for(int p = 2 ; p <= i ; p++){
                System.out.print(p);
                //System.out.print(" ");
            }
            System.out.println();
        }
    }
}
