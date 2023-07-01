package com.neetcode.blind75.medium;

import java.util.HashSet;

public class LongestSubstringLengthNonRepeating {
    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            HashSet<Character> hs = new HashSet<>();
            int length = 1;
            sb.append(s.charAt(i));
            hs.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (hs.contains(s.charAt(j))) {
                    break;
                } else {
                    sb.append(s.charAt(j));
                    hs.add(s.charAt(j));
                    length++;
                }
            }
            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }
}
