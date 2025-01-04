package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class Float5Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] marks= {32.4f , 56.8f ,8.9f ,9.4f ,22.4f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println(sum);
    }
}
