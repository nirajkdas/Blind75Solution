package com.neetcode.blind75.easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1};
        //unoptimised solution without using extra space
        /*for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j) {
                    if((arr[i] ^ arr[j]) == 0) {
                        System.out.println(true);
                        return;
                    }
                }
            }
        }

        System.out.println(false);*/

        //optimised solution using HashSet
        HashSet<Integer> hm = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.contains(arr[i])) {
                System.out.println(true);
                return;
            }
            hm.add(arr[i]);
        }

        System.out.println(false);

    }

}
