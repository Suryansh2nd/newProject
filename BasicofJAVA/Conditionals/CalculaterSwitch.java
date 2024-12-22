package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class CalculaterSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        double a = sc.nextInt();
        System.out.print("Enter the second number : ");
        double b = sc.nextInt();


        System.out.println("choose an operation : ");
        char symbole = sc.next().charAt(0);

        double result;


        switch (symbole){

            case '+':
                result = a + b ;
                System.out.println("addition : "+ result);
                break;

            case '-':
                result = a- b ;
                System.out.println("subtract : "+ result);
                break;

            case '*':
                result = a*b;
                System.out.println("multiplication : "+ result);
                break;

            case '/':
                result = a / b ;
                System.out.println("division : "+ result);
                break;

            case '%':
                result = a % b ;
                System.out.println("division : "+ result);
                break;

            default:
                System.out.println("Error : Undefined symbole , use( + , - , * , / , %) ");


        }
    }

}
