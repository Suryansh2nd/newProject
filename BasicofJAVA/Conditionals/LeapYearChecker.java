package com.suryansh.BasicofJAVA.Conditionals;
import  java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter a year ");
        int year = sc.nextInt();

        if(year%4 ==0 && year%100 != 0 || year%400 == 0){

            System.out.println(year + " is Leap year");

        }

        else{
            System.out.println(year + " is not a leap year");
        }



    }
}
