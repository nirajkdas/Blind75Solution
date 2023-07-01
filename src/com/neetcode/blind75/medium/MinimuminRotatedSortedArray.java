package com.neetcode.blind75.medium;

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.min(nums[0], nums[1]);
        int low = 0;
        int high = nums.length - 1;
        int minimumNumber = 0;
        while (low < high) {
            if (nums[low] < nums[high]) {
                high--;
                minimumNumber = nums[low];
            } else {
                low++;
                minimumNumber = nums[high];
            }
        }
        return minimumNumber;
    }
}
