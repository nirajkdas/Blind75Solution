package com.neetcode.blind75.medium;

public class ProductofArrayExceptSelf {

    public static void main(String[] args){

        int[] nums = {0,0};
        int[] res = productExceptSelf(nums);
        for(int i :res)
            System.out.println(i);

    }



    private static int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        int[] res = new int[nums.length];
        for(int i: nums){
            if(i == 0){
                zeroCount++;
                //continue;
            }else{
             product = product *i;
            }
        }
        if(zeroCount > 1){
            for(int i =0;i < nums.length;i++){
                res[i] = 0;
            }
        }
        if(zeroCount == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    res[i] = product;
                }else{
                    res[i] = 0;
                }
            }
        }
        if(zeroCount == 0){
            for(int i = 0; i < nums.length; i++){
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}
