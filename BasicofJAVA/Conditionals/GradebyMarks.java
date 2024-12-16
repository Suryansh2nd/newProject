package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class GradebyMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Overall Percentage ");
        int p = sc.nextInt();
        //int p = percentile;

        if (p>=90 && p<=100){

            System.out.println("Excellent");
        } else if (p>=80 && p<=90) {
            System.out.println("Very Good");
        } else if (p>=70 && p<=80) {
            System.out.println("Good");

        }else if (p>=60 && p<=70) {
            System.out.println("Can do Better");

        }else if (p>=50 && p<=60) {
            System.out.println("Average");

        }else if (p>=40 && p<=50) {
            System.out.println("Below Average");

        }else if (p<40) {
            System.out.println("Fail");

        }else {
            System.out.println("Enjoy your Life");
        }

    }
}
