package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class ThreedigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Positive Integer : ");
        int num = sc.nextInt();

        if (num > 99 && num < 1000){
            System.out.println("Number contain Three(3) Digits ");
        }else {
            System.out.println("Number not contain Three(3) Digits ");
        }
    }
}
