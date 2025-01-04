package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class sumOfArray {
    public static void main(String[] args) {

        int [] arr = {2 , 89 ,78 ,6 ,1 ,74 ,10};

        int sum = 0;

        for(int i =0 ; i<=arr.length ; i++){
            sum += arr[i];

        }
        System.out.println(sum);
    }
}
