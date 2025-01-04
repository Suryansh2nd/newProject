package com.suryansh.BasicofJAVA.Functions;
import java.util.*;
public class averageOf3 {
    public static int Average(int a, int b , int c){
        int average = a+b+c/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Different Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average of 3 is : ");

        int averageof3 = Average(a,b,c);

        System.out.print(averageof3);
    }
}
