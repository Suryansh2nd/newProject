package com.suryansh.BasicofJAVA.Conditionals;
import java.util.Scanner;
public class areaORperimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter Width of Reactangle : ");
        int b = sc.nextInt();

        int area = l * b ;
        int perimeter = 2*(l+b);

        if (area > perimeter){
            System.out.println("area is Greater then perimeter ");
        }
        if(area < perimeter) {
            System.out.println("perimeter is Greater then area ");
        }
        else {
            System.out.println("Now its SQUARE ");
        }
    }
}
