package dev.batuhansener.java.datastructures.leetcode.arrays;

import java.util.HashMap;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer ,Integer> map = new HashMap<>();
        int gap;

        for(int i = 0 ; i<nums.length ; i++){

            gap = target - nums[i];

            if(map.containsKey(gap)){
                return new int[] {map.get(gap), i};
            }

            map.put(gap, i);
        }
                return null;
    }
}
