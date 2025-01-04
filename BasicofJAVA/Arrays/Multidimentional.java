package com.suryansh.BasicofJAVA.Arrays;
import java.util.*;
public class Multidimentional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] Floor;
        Floor = new int[3][4];
        Floor [0][0] = 301;
        Floor [0][1] = 302;
        Floor [0][2] = 303;
        Floor [0][3] = 304;
        Floor [1][0] = 401;
        Floor [1][1] = 402;
        Floor [1][2] = 403;
        Floor [1][3] = 404;

        //System.out.println(" "+Floor[0][3] +" "+  Floor[1][1] +" "+ Floor[0][0]);

        // Display 2-D Array using For Loops

        for(int i = 0 ; i<Floor.length ; i++){
            for(int j = 0;j<Floor[i].length ; j++){
                System.out.print(Floor[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

        }

    }
}
