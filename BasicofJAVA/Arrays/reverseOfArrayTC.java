package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class reverseOfArrayTC {
    public static int reverse(int num[] ){

        int start = 0 , end = num.length -1;

        while(start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
        return 0;
    }
    public static void main(String[] args) {

        int [] num = { 2 , 3 , 5 ,-4 ,-6 ,8};

        reverse(num);
        for(int i = 0 ; i< num.length ; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();

    }
}
