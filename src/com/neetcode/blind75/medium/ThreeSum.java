package com.neetcode.blind75.medium;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        int []nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res= new HashSet<>();
        for(int i= 0; i < nums.length-2;i++){
            if(i != 0 && nums[i-1] == nums[i]){
                continue;
            }
            int index = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[left] + nums[right]+ index;
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> item : res){
            result.add(item);
        }
        return result;
    }
}
