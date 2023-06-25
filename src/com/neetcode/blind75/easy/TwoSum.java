package com.neetcode.blind75.easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        /*
        Make use of a hashmap,iterate through the array and for each element, deduct the element
        from target and check if it exist in the map. if it exists, return the array indices
        else add the element to hashmap with its index
         */
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (hs.containsKey(remaining)) {
                System.out.println(hs.get(remaining) + "," + i);
                return;
            } else
                hs.put(nums[i], i);
        }
        System.out.println("-1");


    }
}
