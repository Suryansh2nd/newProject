package com.suryansh.BasicofJAVA.Loops;
import java.util.Scanner;
public class evennum1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int i = 1 ; i <= 100 ; i++){
            if(i%2==0) System.out.println(i);
        }
    }
}