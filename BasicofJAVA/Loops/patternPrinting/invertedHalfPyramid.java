package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1 ; i <= 5 ; i++){
            for(int j = 5 ; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
