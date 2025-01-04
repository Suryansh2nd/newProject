package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class numPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] marks= {32.4f , 56.8f ,8.9f ,9.4f ,22.4f};
        float num = sc.nextInt();
        for(float i:marks){
            if(num == i){
                System.out.print("Number is present in Array" + num);
            }else {
                System.out.print("Number is not present in Array" + num);
            }
        }

    }
}
