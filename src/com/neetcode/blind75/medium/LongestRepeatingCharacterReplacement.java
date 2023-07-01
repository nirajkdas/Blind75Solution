package com.neetcode.blind75.medium;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] aashiyana) {
        String s = "ABBB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {
        int left = 0;
        int maxCount = 0;
        int res = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            hm.put(rightChar,hm.getOrDefault(rightChar,0)+1);

            maxCount = Math.max(maxCount,hm.get(rightChar));
            if(right - left +1 -maxCount > k){
                char leftChar = s.charAt(left);
                if(hm.getOrDefault(leftChar,0) == 1){
                    hm.remove(leftChar);
                }else{
                    hm.put(leftChar,hm.getOrDefault(leftChar,0)-1);
                }
                left++;
            }

            res = Math.max(res,right-left +1);
        }

        return res;
    }
}
