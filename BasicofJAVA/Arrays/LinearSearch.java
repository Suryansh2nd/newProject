package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class LinearSearch {
    public static int searching(int numbers[] ,int key){
        for(int i : numbers){
            if(i == key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        /*int [] numbers = {23 ,5 ,6 ,78 ,90 ,61 ,7 ,0 ,56};
        int key = 90;

        int index = searching(numbers ,key);

        if(index == -1){
            System.out.print("Not Found a number");
        }else {
            System.out.print("Found a number" + index);
        }*/



    }
}
