package com.suryansh.BasicofJAVA.Loops;
import java.util.Scanner;
public class arthmaticP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Terms : ");
        int n = sc.nextInt();

        System.out.println("Enter value of A");
        int a = sc.nextInt();

        System.out.println("Enter value of D");
        int d = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.print(a+"  ");
            a += d;

        }
    }
}
