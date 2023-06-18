package com.neetcode.blind75;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = ")(){}";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            switch (a) {
                case '(':
                case '[':
                case '{': {
                    st.push(a);
                    break;
                }
                case ')': {
                    if (!st.empty()) {
                        char x = st.pop();
                        if (x != '(') {
                            System.out.println("Not a valid string");
                            return;
                        }
                        break;
                    }else {
                        System.out.println("Not a valid string");
                        return;
                    }

                }
                case ']': {
                    if (!st.empty()) {
                        char x = st.pop();
                        if (x != '[') {
                            System.out.println("not a valid string");
                            return;
                        }
                        break;
                    }else{
                        System.out.println("not a valid string");
                        return;
                    }
                }
                case '}': {
                    if (!st.empty()) {
                        char x = st.pop();
                        if (x != '{') {
                            System.out.println("not A valid string");
                            return;
                        }
                        break;
                    }else{
                        System.out.println("not A valid string");
                        return;
                    }

                }
            }
        }
        if (st.empty())
            System.out.println("Valid Pallindrome");
        else
            System.out.println("Not a valid pallindrome");

    }
}
