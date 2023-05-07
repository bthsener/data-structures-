package dev.batuhansener.java.datastructures.Codility;

import java.util.HashSet;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(OddOccurrencesInArray.solution(new int[]{9,3,9,5,3,9,7,9,7}));
    }

    public static int solution(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for (int num : A){
            if (set.add(num)){

            }else{
                set.remove(num);
            }
        }

        return set.iterator().next();
    }
}
