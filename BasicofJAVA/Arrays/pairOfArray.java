package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class pairOfArray {
    public static int pair(int num[]){

        for(int i =0 ;i <num.length ; i++){
            int curr = num[i] ; // 4, 7 ,8 ,90 ,34 ,1

            for(int j = i+1; j< num.length ;j++){
                System.out.print("(" + curr + "," + num[j] + ")");
            }
            System.out.println();
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] num = {4 ,7, 8 ,90 ,34 ,1};
        pair(num);

    }
}
