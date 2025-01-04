package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class totalpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];

        System.out.println("Enter Semester 1 Subjects Marks : ");
        marks[0] = sc.nextInt();  // programming
        marks[1] = sc.nextInt();  // iot
        marks[2] = sc.nextInt();  // maths
        marks[3] = sc.nextInt();  // dsa


        System.out.println("programming :"+ marks[0]);
        System.out.println("internet of things :"+ marks[1]);
        System.out.println("maths :"+ marks[2]);
        System.out.println("data stuctures :"+ marks[3]);

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3])/3;
        System.out.println("percentage"+ percentage + "%");

        // Count Array Length

        /*
        System.out.println("Length of Array : " + marks.length);
         */



    }

}
