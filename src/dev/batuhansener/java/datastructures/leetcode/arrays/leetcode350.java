package dev.batuhansener.java.datastructures.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = 0, n = 0;
        ArrayList<Integer> depo = new ArrayList<>();


        while(true){
            if (m==nums1.length || n== nums2.length) {
                break;
            }
            if (nums2[n]>nums1[m]){
                m++;
            }else if (nums2[n]<nums1[m]){
                n++;
            }else if (nums2[n]==nums1[m]){
                depo.add(nums2[n]);
                m++;
                n++;
            }
        }

        int[] result = new int[depo.size()];
        for (int i = 0; i<depo.size(); i++){
            result[i] = depo.get(i);
        }

        return result;

    }
}
