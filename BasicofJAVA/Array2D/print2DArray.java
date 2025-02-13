package com.suryansh.BasicofJAVA.Array2D;

import java.util.*;
public class print2DArray {
    public static void reverseArray(int []num ) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows : ");
        int row = sc.nextInt();
        System.out.println("enter the column : ");
        int column = sc.nextInt();

        int [][]num = new int[row][column];

        System.out.println("Make the "+row*column+" Array ");
        for(int i = 0 ; i< row ; i++){
            for(int j =0 ; j<column ; j++){
                num[i][j] = sc.nextInt();
            }
        }

        //print the array
        System.out.println("Array is : ");
        for(int i = 0 ;i< row ; i++){
            for(int j = 0 ; j < column ;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        //reverseArray(num);



    }
}
