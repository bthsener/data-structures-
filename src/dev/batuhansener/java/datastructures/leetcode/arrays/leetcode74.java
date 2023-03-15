package dev.batuhansener.java.datastructures.leetcode.arrays;

public class leetcode74 {
    public static void main(String[] args) {

        int[][] deneme = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 2;

        System.out.println(searchMatrix(deneme,target));


    }

    static public boolean searchMatrix(int[][] matrix, int target) {

        int w = matrix[0].length-1;
        int targetindex = matrix.length-1;

        if(target>matrix[targetindex][w]){
            return false;
        }

        for(int i = matrix.length-1 ; i>=0 ; i--){
            if(target<=matrix[i][w]){
                targetindex = i;
            }
        }

        for(int i = 0 ; i<=w ; i++){
            if(target==matrix[targetindex][i]){
                return true;
            }
        }

        return false;


    }
}
