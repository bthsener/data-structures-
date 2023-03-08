package dev.batuhansener.java.datastructures.leetcode.set.hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class leetcode217 {

    public boolean containsDuplicate(int[] nums){

        Set<Integer> numsTest = new HashSet<>();

        for (int a : nums){
            if (!numsTest.add(a)){
                return true;
            }
        }
        return false;
    }

}
