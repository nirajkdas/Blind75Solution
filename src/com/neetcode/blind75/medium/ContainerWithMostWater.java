package com.neetcode.blind75.medium;

public class ContainerWithMostWater {
    public static void main(String[] a){
        int[] height = {1,2,1};

        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
       int low = 0;
       int high = height.length-1;
       int maxArea = 0;
       while(low < high){
           int area = (high - low) * Math.min(height[low],height[high]);
           maxArea = Math.max(maxArea,area);
           if(height[high] <= height[low])
               high--;
           else
               low++;
       }
       return maxArea;
    }
}
