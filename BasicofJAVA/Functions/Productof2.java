package com.suryansh.BasicofJAVA.Functions;
import java.time.format.SignStyle;
import java.util.*;
public class Productof2 {
    public static int calculateProduct(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a,b);
        System.out.println("the product of 2 numbers : " +product);

    }
}
