package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class pracSubarraySum {
    public static int maxSumSubarray(int num[]){
        int curSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int prifix[] = new int[num.length];

        prifix[0] = num[0];

        for(int i = 0 ; i<prifix.length ; i++){
            prifix[i] = prifix[i-1] - num[i];
        }

        for(int sta =0 ; sta < num.length ;sta++){
            for(int end = sta ; end < num.length ; end++ ){

                curSum = sta == 0 ? prifix[end] : prifix[end] - prifix[sta - 1];

                if(maxSum < curSum){
                    maxSum = curSum;
                }
                System.out.println(curSum);
            }

        }
        System.out.println(" the Maximum Of All Subarray is = "+ maxSum);


       return -1;
    }

    public static void main(String[] args) {
        int [] num = {2 ,6 ,9 ,0 ,-2 ,-56 ,-1};
       maxSumSubarray(num);
    }
}
