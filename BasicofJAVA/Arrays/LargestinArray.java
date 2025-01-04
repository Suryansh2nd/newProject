package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class LargestinArray {
    public static int getLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        int [] numbers ={2 ,67 ,89 ,54 ,32 ,8};

        System.out.println("Largest Number is : "+ getLargest(numbers));



    }
}
