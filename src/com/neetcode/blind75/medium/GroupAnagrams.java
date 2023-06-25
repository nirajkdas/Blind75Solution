package com.neetcode.blind75.medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        //String []strs = {"eat","tea","tan","ate","nat","bat"};
        String []strs = {"a"};
        List<List<String>> res = groupAnagrams(strs);
        for(List<String> st : res)
            System.out.println(st);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String st = String.valueOf(a);
            if(!hm.containsKey(st)){
                List<String> tmp = new ArrayList<>();
                tmp.add(strs[i]);
                hm.put(st,tmp);
            }else{
                List<String> tmp = hm.get(st);
                tmp.add(strs[i]);
                hm.put(st,tmp);
            }
        }
        List<List<String>> ar = new ArrayList<List<String>>();

        for (String name : hm.keySet())
        {
           ar.add(hm.get(name));
        }

        return ar;
    }
}
