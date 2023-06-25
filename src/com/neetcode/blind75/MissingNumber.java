package com.neetcode.blind75;

public class MissingNumber {
    public static void main(String[] args){
        int []nums = {3,0,1};
        int n = 3;
        int sum = (n *(n+1))/2;
        int sumTillNow= 0;
        for(int i = 0; i < nums.length; i++){
            sumTillNow = sumTillNow + nums[i];
        }

        System.out.println (sum - sumTillNow);

    }
}
