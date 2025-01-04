package com.suryansh.BasicofJAVA.Functions;
import java.util.*;
public class sumOfodd {
    public static int SumofOddnum(int n){

        int total = 0;
        for(int i =1 ; i<=n ; i++){
            if(n%2==1){
                total = total + i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr Number : ");

        int s = sc.nextInt();

        System.out.println(SumofOddnum(s));

    }
}
