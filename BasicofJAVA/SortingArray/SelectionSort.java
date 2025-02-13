package com.suryansh.BasicofJAVA.SortingArray;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int []arr){
        for(int i =0 ;i< arr.length-1 ;i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {

                    minPos = j;
                }
            }
            //swap

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void printarr(int [] arr) {
        for(int i = 0 ; i< arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int [] arr = {4 ,1 ,9 ,2 ,3 ,6};
        selectionSort(arr);
        printarr(arr);

    }
}
