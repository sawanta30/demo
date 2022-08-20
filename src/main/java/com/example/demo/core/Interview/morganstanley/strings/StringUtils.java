package com.example.demo.core.Interview.morganstanley.strings;

public class StringUtils {

    public static char getMaxOccuringChar(String str){
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();
        final int ASCII_SIZE = 256;
        int[] data = new int[ASCII_SIZE];
        for(char ch : str.toCharArray()){
           data[ch]++;
        }
        int max = 0;
        char result = ' ';
        for (int i = 0; i < data.length ; i++) {
            if(data[i]>max){
                max = data[i];
                result = (char)i;
            }
        }
        return result;

    }
}
