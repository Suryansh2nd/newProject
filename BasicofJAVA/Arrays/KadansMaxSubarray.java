package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class KadansMaxSubarray {

    public static void maxSubarrayKadans(int num[]){
        int currentsum = 0 ;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i<num.length ;i++){
            currentsum = currentsum + num[i];

            if(currentsum < 0){
                currentsum = 0;
            }
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println("Our max Subarray sum using Kadans Algo : " + maxsum);

    }
    public static void main(String[] args) {
        int num[] ={-2 ,-3 ,4 ,-1 ,-2 ,1 ,5 ,-3};
        maxSubarrayKadans(num);

    }
}
