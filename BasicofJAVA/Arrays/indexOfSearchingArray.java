package com.suryansh.BasicofJAVA.Arrays;
import java.time.format.SignStyle;
import java.util.*;
public class indexOfSearchingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] num = new int[size];

        //Input Array
        for(int i = 0 ; i<size ; i++){
            num[i] = sc.nextInt();
        }
        //Input size
        for(int i = 0 ;i< size ; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.print("Enter the Element to find its index: ");
        int x = sc.nextInt();

        for(int i = 0 ; i<num.length ; i++){
            if(num[i] == x){
                System.out.print(i);
            }
        }

    }
}
