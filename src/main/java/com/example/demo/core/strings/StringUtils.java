package com.example.demo.core.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StringUtils {

    public static List<String> getAnagrams(List<String> strList){
        List<String> anagramList = new ArrayList<>();
        strList.stream()
                .filter(Objects::nonNull)
                .filter(str->! str.isEmpty())
                .forEach(s->{
                char[] chars = s.toCharArray();
                int start = 0;
                int end = chars.length -1;
                boolean isAnagram = true;
                while(start < end){
                    if (chars[start++] != chars[end--]){
                        isAnagram = false;
                    }
                }
                if (isAnagram)
                    anagramList.add(s);
        });
        return anagramList;
    }
}
