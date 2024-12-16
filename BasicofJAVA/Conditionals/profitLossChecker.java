package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class profitLossChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.println("Enter Selling Price : ");
        int sp = sc.nextInt();

        if (sp>cp){
            System.out.print("Your Profit is : ");
            System.out.println(sp-cp);

        } if (cp>sp){
            System.out.print("Your Loss is : ");
            System.out.println(cp-sp);
        }
    }
}
