package com.suryansh.BasicofJAVA.Functions;
import java.util.*;
public class grettestOf2 {
    public static int gretestof2(int a , int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gretestof2(a,b));


    }
}
