package com.neetcode.blind75.medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] res = topKFrequent(nums, k);
        for (int i : res)
            System.out.println(i);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return o2.getKey() - o1.getKey();
                } else {
                    return o2.getValue() - o1.getValue();
                }
            }
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}
