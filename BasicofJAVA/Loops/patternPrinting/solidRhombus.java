package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class solidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1 ;i<=5 ; i++){
            for(int s = 1 ; s <= 5-i ; s++ ){
                System.out.print(" ");
            }
            for(int j = 1; j <= 5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
