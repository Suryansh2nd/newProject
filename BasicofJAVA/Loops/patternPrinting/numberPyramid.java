package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1 ; i <= 5 ; i++){
            for(int s = 1 ; s <= 5-i ; s++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= i ; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
