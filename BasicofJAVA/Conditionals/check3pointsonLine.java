package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class check3pointsonLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = 3 , x2 = 5 , x3 = 6 , y1 = 8 , y2 = 5 , y3 = 7 ;

        double m1 = (y2 - y1 / x2 - x1);
        double m2 = (y3 - y2 / x3 - x2);

        if(m1 == m2){
            System.out.println("Pointes lies on a straight line");
        }else {
            System.out.println("do not lies on straight line");
        }

    }
}
