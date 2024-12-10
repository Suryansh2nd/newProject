package com.suryansh.BasicofJAVA.InputUser;
import java.util.Scanner;
public class sumOf2numInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 number ");

        int a = sc.nextInt();

        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of two number is "+ sum);

    }
}
