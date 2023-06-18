package com.neetcode.blind75;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {



    String s1 = "rat";
    String s2 = "tarrr";
    //use hashmap and store the character and frequency of each character in the hashmap.Iterate the next
    // string and decrement value of each character. Once iteration is completed check if hashmap is not empty
    HashMap<Character,Integer> hm = new HashMap<>();

    for(int i = 0; i < s1.length(); i++){
        if(hm.containsKey(s1.charAt(i))){
            hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
        }else{
            hm.put(s1.charAt(i),1);
        }
    }

    for(int i = 0; i < s2.length(); i++){
        if(!hm.containsKey(s2.charAt(i))){
            System.out.println(false);
            return;
        }else{
            if(hm.get(s2.charAt(i)) == 1){
                hm.remove(s2.charAt(i));
            }else{
                hm.put(s2.charAt(i),hm.get(s2.charAt(i))-1);
            }
        }
    }

    if(hm.isEmpty()){
        System.out.println(true);
    }


    }
}
