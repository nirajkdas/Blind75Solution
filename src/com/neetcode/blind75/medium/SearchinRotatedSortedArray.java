package com.neetcode.blind75.medium;

public class SearchinRotatedSortedArray {
    public static void main(String[] a) {
        int[] nums = {5, 1, 3};
        int target = 5;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (nums[high] >= target && target >= nums[mid]) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
