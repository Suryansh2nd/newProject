package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1 ; i <= 4 ; i++){
            for(int j =1 ; j<= 4 ;j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}