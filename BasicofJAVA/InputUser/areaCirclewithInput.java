package com.suryansh.BasicofJAVA.InputUser;
import java.util.Scanner;
public class areaCirclewithInput {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius ");
        int radius = sc.nextInt();
        double pi = 3.1415;

        double area = pi * radius * radius;

        System.out.println("Area of Circle " +area);


    }
}
