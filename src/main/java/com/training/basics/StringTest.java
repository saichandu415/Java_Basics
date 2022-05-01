package com.training.basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringTest {
    // stoic
    // name : saisarathchandra
    // 50*101 = 5050

    public static void main(String[] args) {
        System.out.println(getLetterCount("saisarathchandra"));
    }

    public static Map<Character, Integer> getLetterCount(String input){

        Map<Character, Integer> result = new LinkedHashMap<>();

        final char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            if(result.get(inputArr[i]) == null)
                result.put(inputArr[i],1);
            else
                result.put(inputArr[i],result.get(inputArr[i])+1);
        }

        return result;
    }

}
