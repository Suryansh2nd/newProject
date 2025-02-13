package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class subArray {
    public static int printSubarray(int num[]){
        int total = 0;

        for(int i = 0 ; i< num.length ; i++){

            for(int j = i ; j<num.length ; j++){

                for(int k = i ; k <= j ;k++){
                    System.out.print(" "+ num[k]+ " ");
                }
                total++;
                System.out.println();

            }
            System.out.println();

        }

        System.out.println("total Num of Subarray "+ total);
        return -1;
    }
    public static void main(String[] args) {
        int [] num ={ 5 ,3 , 4 ,2 ,7 , 8};
        printSubarray(num);

    }
}
