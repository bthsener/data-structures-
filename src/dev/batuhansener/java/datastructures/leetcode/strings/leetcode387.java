package dev.batuhansener.java.datastructures.leetcode.strings;

import java.util.HashSet;

public class leetcode387 {
    public static void main(String[] args) {

    }

    static int firstUniqChar(String s){
        HashSet<Character> set = new HashSet<>();
        int index = -1;

        if (s.length()==1){
            return 0;
        }else {
        for(int i = s.length()-1 ; i>=0 ; i--){
            if (set.add(s.charAt(i))){
                index = i;
            }
        }
        }
        return index;
    }
}
