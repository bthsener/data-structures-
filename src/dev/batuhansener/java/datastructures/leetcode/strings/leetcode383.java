package dev.batuhansener.java.datastructures.leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class leetcode383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab","baa"));
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        int m = magazine.length();
        int r = ransomNote.length();

        HashMap<Integer, Character> deneme = new HashMap<>();
        ArrayList<Character> deneme2 = new ArrayList<>();


        for(int i = 0 ; i<m ; i++){
            deneme2.add(i, magazine.charAt(i));
        }

        int a = 0;
        for (int i = 0 ; i<r ; i++){
            if (deneme2.contains(ransomNote.charAt(i))){
                deneme2.remove(ransomNote.charAt(i));
            }
        }

        if(a<r){
            return false;
        }

        return true;
    }
}
