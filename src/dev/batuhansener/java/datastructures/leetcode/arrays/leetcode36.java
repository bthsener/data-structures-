package dev.batuhansener.java.datastructures.leetcode.arrays;

import java.util.HashSet;

public class leetcode36 {
    public static void main(String[] args) {
        char[][] board = {{'.','3','.','.','7','.','.','.','.'},{'6','3','.','1','9','5','.','.','.'}};

        System.out.println(isValidSudoku(board));
    }

    static public boolean isValidSudoku(char[][] bgit oard) {
        HashSet<Character> col = new HashSet<>();
        HashSet<Character> row = new HashSet<>();

        for(int i = 0 ; i<board.length ; i++){
            col.clear();
            if (row.add(board[i][0])){
                if (board[i][0]=='.') {row.remove('.'); continue;}
                System.out.println(board[i][0]+" eklendi");
                for (int w = 0 ; w<board[i].length ; w++){
                    if (col.add(board[i][w])){
                        if (board[i][w]=='.') col.remove('.');
                        System.out.println(board[i][w]+" eklendi");
                    }else {
                        return false;
                    }
                }
            }else{
                return false;
            }
        }
        return true;
    }
}

//for (int i = 0 ; i<9 ; i++){
//        target = board[i][0];
//
//        if (target!='.'){
//        for (int w = 0 ; w<9 ; w++){
//        if (board[i][w+1]==target&&w<=8){
//        return false;
//        }
//
//        if(i!=w&&board[w][0]==target){
//        return false;
//        }
//        }
//        }
//        }