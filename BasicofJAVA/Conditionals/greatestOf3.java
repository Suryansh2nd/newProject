package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class greatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println(" First Number is Greatest ");
        }
        else if (b>a && b>c) {
            System.out.println(" Second Number is Greatest ");
        }
        else {
            System.out.println(" Third number is Greatest ");

        }
    }
}
