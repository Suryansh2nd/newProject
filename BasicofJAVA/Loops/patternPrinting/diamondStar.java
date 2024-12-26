package com.suryansh.BasicofJAVA.Loops.patternPrinting;
import java.util.Scanner;
public class diamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=4 ; i++){
            for(int s = 1 ; s<=4-i ;s++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k = 4 ; k>=1 ; k--){
            for(int s = 4-k ; s>=1 ; s--){
                System.out.print(" ");
            }
            for(int j = 2*k-1 ; j>=1 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
