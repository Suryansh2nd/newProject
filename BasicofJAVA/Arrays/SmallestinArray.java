package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class SmallestinArray {
    public static int getSmallest(int numbers[]){

        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i<numbers.length ; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {

        int [] numbers = {0 ,9 ,-2 ,-4 ,56 ,8};
        System.out.println("Smallest number is " + getSmallest(numbers));

    }
}
