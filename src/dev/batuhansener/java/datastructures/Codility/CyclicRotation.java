package dev.batuhansener.java.datastructures.Codility;

import java.util.*;

public class CyclicRotation {
    public static void main(String[] args){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] A = new int[]{1,2,3,4};
        cyclicRotation.solution(A, 3).forEach(System.out::print);
    }

    public List<Integer> solution(int[] A, int K){
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0;i<A.length;i++){
            list.add(A[i]);
        }

        for (int i = 0 ;i<K; i++){
            list.add(0, list.get(A.length-1));
            list.remove(A.length);
        }

        return list;
    }
}
