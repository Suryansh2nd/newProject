package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class BinarySearch {
    public static int binarysearch(int num[] , int key  ){

        int low = 0 , heigh = num.length-1;



        while(low <= heigh){
            int mid = (low + heigh)/2;

            if(num[mid] == key){
                return mid;
            }
            else if (num[mid] < key) {
                low = mid + 1;
            }
            else {
                heigh = mid - 1;
            }

        }
        return -1 ;
    }
    public static void main(String[] args) {

        int [] num = {-4 ,-1 ,3 ,7 ,10 ,11};
        int key = 7;

        System.out.println("Index for Key is :" + binarysearch(num , key));

    }
}
