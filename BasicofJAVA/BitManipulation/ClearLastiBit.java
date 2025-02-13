package com.suryansh.BasicofJAVA.BitManipulation;
import java.util.*;
public class ClearLastiBit {
    public static int toClearLastBit(int n , int i ) {

        int bitMask = ~0 << i;
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(toClearLastBit(15 , 2));

    }
}
