package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class maxSubarraySum {
    public static int maxSubarraySum(int num[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i< num.length ; i++){

            for(int j = i ; j<num.length ; j++){
                curSum = 0;

                for(int k = i ; k <= j ;k++){
                    curSum += num[k];

                    //System.out.print(" "+ num[k]+ " ");
                }
                if(maxSum < curSum){
                    maxSum = curSum;
                }
                System.out.println(curSum);
            }
        }
        System.out.println("Maximun Sum ="+ maxSum );

        return -1;
    }
    public static void main(String[] args) {
        int [] num ={ 5 ,3 , -4 ,2 ,7 , -8};
        maxSubarraySum(num);

    }
}

