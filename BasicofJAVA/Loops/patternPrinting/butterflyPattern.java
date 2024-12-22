package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i<= 7 ; i++){
            for(int j = 0 ; j<= i+1 ; j++ ){
                System.out.print("*");
            }

            for(int s = 0 ; s <= (2*8-2*i-2) ; s++){
                System.out.print(" ");
            }

            for(int j = 0 ; j<= i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        for(int i =0 ; i<= 7 ; i++){
            for(int j = 0 ; j<= 8-i ; j++ ){
                System.out.print("*");
            }

            for(int s = 0 ; s <= 2*i ; s++){
                System.out.print(" ");
            }

            for(int j = 0 ; j<= 8-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
