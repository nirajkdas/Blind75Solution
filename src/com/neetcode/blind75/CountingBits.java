package com.neetcode.blind75;

public class CountingBits {

    public static void main(String[] args) {
        int n = 2;
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = count1Bit(i);
        }
        for (int i : result)
            System.out.println(i);
    }

    public static int count1Bit(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1)
                count++;

            n >>= 1;
        }

        return count;
    }
}
