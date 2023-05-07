package dev.batuhansener.java.datastructures.Codility;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println(PermMissingElem.solution(new int[]{2,3,1,4,9,10,8,5,6}));
    }

    public static int solution(int[] A){
        Arrays.sort(A);
        int c=0;
        for (int num : A){
            if (num!=c+1){
                return c+1;
            }
            c++;
        }
        return 0;
    }
}
