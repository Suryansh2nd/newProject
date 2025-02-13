package com.suryansh.BasicofJAVA.Array2D;
import java.util.*;
public class spirellymatrix {
    public static void spirellyTraversing(int[][] arr) {

        int left =0;
        int right = arr.length-1;
        int top = 0;
        int bottom = arr.length-1;

        while(left <= right && top <=bottom){
            //top
            for(int i =left ; i<=right; i++){
                System.out.print(arr[top][i]+ " ");
            }

            //right
            for(int j =top+1 ;j<= bottom ;j++){
                System.out.print(arr[j][right] + " ");
            }

            //bottom
            for(int k =right-1 ;k>=left ;k--){
                if(top == bottom){
                    break;
                }
                System.out.print(arr[bottom][k] + " ");
            }

            //top
            for(int l =bottom-1 ; l>=top+1 ;l--){
                if(right == left){
                    break;
                }
                System.out.print(arr[l][top] + " ");
            }

            top++;
            right--;
            bottom--;
            left++;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int [][]arr = {{1 , 2 ,3 ,4},
                {5 , 6, 7 ,8},
                {9 ,10 ,11 ,12},
                {13 ,14 ,15 ,16}};

        spirellyTraversing(arr);
    }
}
