package dev.batuhansener.java.datastructures.leetcode.arrays;

public class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mm = m-1;
        int nn = n-1;
        int last = nums1.length-1;

        while (nn>=0){
            if (mm>=0 && nums1[mm]>nums2[nn]){
                nums1[last] = nums1[mm];
                last--;
                mm--;
            }else{
                nums1[last] = nums2[nn];
                nn--;
                last--;
            }
        }
    }
}
