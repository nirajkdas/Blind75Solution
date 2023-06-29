package com.neetcode.blind75.medium;

import java.util.*;

public class EncodeDecodeStrings {
    public static void main(String[] args){
        String[] str = {"lint","code","love","you"};
        List<String> strs = Arrays.asList(str);
        System.out.println(strs);
        String encodedString = encode(strs);
        List<String> decodedArray = decode(encodedString);
        System.out.println(decodedArray);
    }

    private static List<String> decode(String encodedString) {
        String[]  result = encodedString.split("#");
        return Arrays.asList(result);
    }

    private static String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(String s : strs){
            encodedStr.append(s);
            encodedStr.append("#");
        }
        return encodedStr.toString();
    }
}
