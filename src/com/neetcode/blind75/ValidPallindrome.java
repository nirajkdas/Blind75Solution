package com.neetcode.blind75;

public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        /*
        Logic :  replace the specialcharacters inside the string using regex expression
        Create a new string builder and create a string which is  reversed and compare the
        reversed string with the original string. Return true if both are same else return false.
         */
        s = s.replaceAll("//s", "").toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder strReverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            strReverse.append(s.charAt(i));
        }
        //System.out.println(strReverse.toString());
        System.out.println(s.equalsIgnoreCase(strReverse.toString()));
    }
}
