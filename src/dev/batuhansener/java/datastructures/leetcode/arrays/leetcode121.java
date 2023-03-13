package dev.batuhansener.java.datastructures.leetcode.arrays;

public class leetcode121 {
    public int maxProfit(int[] prices) {
        int maxkar, alis = Integer.MAX_VALUE, kar;

        for (int i = 0 ; i<prices.length ; i++){

            if (alis<prices[i]){
                alis = prices[i];
            }

            kar = prices[i] - alis;

            maxkar = Math.max(kar, maxkar);
        }

        return maxkar;
    }
}
