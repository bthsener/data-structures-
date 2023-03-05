package dev.batuhansener.java.datastructures.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class leetcode217 {

    public boolean containsDuplicate(int[] nums){

        Set<Integer> numsTest = new HashSet<>();

        for (int a : nums){
            if (numsTest.contains(a)){
                return true;
            }
            numsTest.add(a);
        }
        return false;
    }

}
