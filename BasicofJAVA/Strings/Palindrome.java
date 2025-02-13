package com.suryansh.BasicofJAVA.Strings;
import java.lang.String;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {

        for(int i = 0 ; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word to check : ");
        String str = sc.nextLine();

        System.out.println( isPalindrome(str));
    }
}
