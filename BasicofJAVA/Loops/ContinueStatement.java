package com.suryansh.BasicofJAVA.Loops;
import java.util.Scanner;
public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter a Number : ");
        int n = sc.nextInt();*/

        for(int i = 1 ; i <= 100; i++){

            if(i%2==1) continue;

            System.out.println(i);

        }
    }
}
