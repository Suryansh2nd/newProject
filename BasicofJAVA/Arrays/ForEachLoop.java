package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class ForEachLoop {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        /*
        double [] marks = {34.5 , 6.7 ,8.9 ,34.90 ,4.00 ,9.1 , 67.89};

        String [] students = {"rohan" , "suryansh" ,"rudransh" ,"arjun" , "krishna" , "Karna"};
        System.out.println(String[4]);
        */

        int []  marks = {34 ,67 ,98 ,81 ,83 ,65 ,30};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        // Using for Loop print Array
        System.out.println("Using for Loop print Array");

        for(int i = 0 ; i< marks.length ; i++){
            System.out.println(marks[i]);
        }

        // Reverse using for loop print Array
        System.out.println("Reverse using for loop print Array");

        for(int i = marks.length-1; i>=0 ; i--){
            System.out.println(marks[i]);
        }

        // using for Each Loop
        System.out.println("using for Each Loop");
        for( int element:marks){
            System.out.print(element + ' ');
        }
    }
}
