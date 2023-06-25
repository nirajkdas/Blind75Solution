package com.neetcode.blind75;

public class NumberOf1Bits {

    public static void main(String[] args){
        int n =  00000000000000000000000010000000;

        int count = 0;

        for(int i = 0; i < 32; i++){
            if((n&1) == 1){
                count++;
            }
            n>>=1;
        }

        System.out.println(count);
    }
}
