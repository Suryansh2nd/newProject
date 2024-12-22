package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class zero1Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int e = i+j;
        for(int i = 1 ; i<=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
