package com.suryansh.BasicofJAVA.Functions;

import java.util.*;

public class Factorial {
    public static int findFactorial(int n ){

        int factorial = 1 ;
        for(int i = n ; i>= 1 ; i--){

            factorial = factorial * i ;

        }
        System.out.println(factorial);
        return factorial;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = findFactorial(n);

        System.out.println("Factorial of input number : "+ n);




    }
}
