package com.suryansh.BasicofJAVA.InputUser;

import java.util.Scanner;

public class findRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Divident");
        int divident = sc.nextInt();

        System.out.println("Enter Devisor");
        int devisor = sc.nextInt();

        int quotient = divident/devisor;

        //int remainder = divident - (quotient*devisor);
        int remainder = devisor % devisor;
        System.out.println("The Remainder when "+ divident + " and " + devisor + " and "+ quotient + " is :"+ remainder);
    }

}
