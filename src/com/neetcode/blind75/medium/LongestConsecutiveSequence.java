package com.neetcode.blind75.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args){
        int []nums = {0,0};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();
      for(int i = 0; i < nums.length;i++){
          hs.add(nums[i]);
      }
      int longestConsecutive = 0;
      for(int i = 0;i < nums.length; i++){
          if(!hs.contains(nums[i]-1)){
              int length = 1;
              int num = nums[i];
              while(hs.contains(num+1)){
                  length++;
                  num++;
              }
              if(longestConsecutive < length)
                  longestConsecutive = length;
          }
      }
      return longestConsecutive;
    }

}
