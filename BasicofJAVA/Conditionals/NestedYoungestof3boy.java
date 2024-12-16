package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class NestedYoungestof3boy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ram Age : ");
        int Ram = sc.nextInt();
        System.out.println("Enter Shyam Age  : ");
        int shyam = sc.nextInt();
        System.out.println("Enter Ajay Age : ");
        int ajay = sc.nextInt();

        if(Ram>shyam){
            if(Ram>ajay){
                System.out.println(Ram + "is largest");
            } else {
                System.out.println(ajay + "is largest");
            }
        }else {
            if(shyam>ajay){
                System.out.println(shyam +"is largest");
            }else{
                System.out.println(ajay + "is largest");
            }

        }
    }
}
