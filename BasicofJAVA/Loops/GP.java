package com.suryansh.BasicofJAVA.Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a No. of Terms : ");
        int n = sc.nextInt();

        System.out.print("Enter value of A : ");
        int a = sc.nextInt();

        System.out.print("Enter ratio : ");
        int r = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.println(a+" ");
            a *= r;
        }
    }
}
