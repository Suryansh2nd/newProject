package com.suryansh.BasicofJAVA.Loops;
import java.util.Scanner;
public class tabelof19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1 ; i<= 10 ; i++){
            int tabel = 19*i;
            System.out.println("19 x "+ i + " = " + tabel);
        }
    }
}
