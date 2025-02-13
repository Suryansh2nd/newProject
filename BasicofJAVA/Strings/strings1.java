package com.suryansh.BasicofJAVA.Strings;
import java.util.*;
public class strings1 {
    public static void printLetters(String str) {
        for(int i = 0 ; i<str.length() ;i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char []arr = {'a', 'b' , 'c' , 'd'};
        String str = "a,b,c,d,e";
        String str2 = new String("x,y,z,k");
        System.out.println(str2);

        // Strings are IMMUTABEL

        String name ;
        name = sc .nextLine();
        System.out.println(name);

        // how to find length of string
        System.out.println(name.length());

        // how to concatinate the string

        String firstname = "suryansh";
        String sirname = "rana";
        String fullname = firstname + " " + sirname;
        System.out.println("my full name is " + fullname);

        printLetters(fullname);


    }
}
