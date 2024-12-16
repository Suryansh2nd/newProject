package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class divisibleOf5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");

        int n = sc.nextInt();;

        if(n % 5 == 0 || n % 3 == 0){
            System.out.println("Enter Number is Divisible by 5 Or 3");
        }
        else{
            System.out.println("Number is not Divisible by 5 Or 3");
        }
        /* if(n % 5 == 0 && n % 3 == 0){
            System.out.println("Enter Number is Divisible by 5 Or 3");
        }
        else{
            System.out.println("Number is not Divisible by 5 Or 3");
        } */
    }

}
