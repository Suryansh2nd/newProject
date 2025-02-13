package com.suryansh.BasicofJAVA.SortingArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BubbleSelectionInversionSorting {
    public static void bubbleSort(int []arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                swap++;
            }

            if(swap == 0){
                break;
            }
        }


    }

    public static void printarr(int []arr) {

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }




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





    public static void insertionSort(int []arr) {
        for(int i = 1 ; i<arr.length ;i++){
            int curr = arr[i];
            int previ = i-1;

            while(previ >=0 && arr[previ] > curr){
                arr[previ+1] = arr[previ];
                previ--;
            }
            //insertion

            arr[previ+1] =curr;
        }


    }

    public static void main(String[] args) {
        int [] arr = {8 ,4 ,1 ,5 ,9 ,2};
        //insertionSort(arr);
        Arrays.sort(arr , 0 ,4);

        //Arrays.sort(arr , Collections.reverseOrder());
        printarr(arr);
    }
}
