package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer : ");

        int integer = sc.nextInt();


        if(integer<0)
        {
            integer = integer* (-1);
        }

        System.out.println("The absolute value is : " + integer);

    }
}
