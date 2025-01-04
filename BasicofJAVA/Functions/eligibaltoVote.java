package com.suryansh.BasicofJAVA.Functions;
import java.util.*;
public class eligibaltoVote {
    public static int Eligibal_to_VOTE(int age){

        if(age<=18){
            System.out.println("Note Eligibal To VOTE");

        }else{
            System.out.println("Eligibal To VOTE");

        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age: ");

        int age= sc.nextInt();
        System.out.println(Eligibal_to_VOTE(age));
    }
}
