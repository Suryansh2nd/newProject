package com.suryansh.BasicofJAVA.Strings;

public class SubString {

    public static String substring(String str , int st , int ei) {

        String subStr = "";
        for(int i = st ; i<ei ; i++){
            subStr = subStr + str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // inbuild string function
        System.out.println(str.substring(0 ,5));
        // user defined function
        System.out.println(substring(str , 0  ,7));
    }
}
