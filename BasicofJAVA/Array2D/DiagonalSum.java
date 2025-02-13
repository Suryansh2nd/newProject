package com.suryansh.BasicofJAVA.Array2D;
import java.util.*;
public class DiagonalSum {
    public static int Digonalsum(int [][]arr) {
        int sum = 0 ;

//        for(int i = 0; i<arr.length ; i++){
//            for(int j = 0 ;j<arr[0].length ; j++){
//                if(i == j){
//                    sum = sum + arr[i][j];
//                }
//                else if (i+j == arr.length-1){
//                    sum = sum + arr[i][j];
//
//                }
//            }
//        }
//        System.out.println(sum+ " ");
//        return sum;

        for(int i = 0 ; i< arr.length ; i++){
            //left Digonal
            sum = sum + arr[i][i];

            //right Digonal
            if(i != arr.length-1-i) {
                sum = sum + arr[i][arr.length - 1 - i];
            }

        }
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
        int [][]arr = {{1 ,2, 3 ,4},
                {5 ,6 ,7 ,8},
                {9 ,10 ,11 ,12},
                {13 ,14 ,15 ,16}};

        Digonalsum(arr);
    }
}
