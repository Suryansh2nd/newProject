package com.suryansh.BasicofJAVA.Array2D;

import java.util.*;
public class findingElementKey {

    public static boolean search(int num[][] ,int row ,int column , int key ) {

        for(int i = 0 ; i<row ;i++){
            for(int j = 0 ; j<column ;j++){
                if(num[i][j] == key){
                    System.out.println("found at cell " + "(" + i +"," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("index not found");
        return false;

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
        search(num , 3 , 3 , 7);
        System.out.println("Enter the Key to Find : ");
        int key = sc.nextInt();



    }
}
