package com.suryansh.BasicofJAVA.Strings;

public class PrintLargestString {
    public static void main(String[] args) {
        String []Fruit = {"apple" ,"mango" ,"banana"};

        String largest = Fruit[0];

        for(int i = 0 ; i<Fruit.length ;i++){
            if(largest.compareToIgnoreCase(Fruit[i]) < 0){
                largest = Fruit[i];
            }
        }
        System.out.println(largest);
    }
}
