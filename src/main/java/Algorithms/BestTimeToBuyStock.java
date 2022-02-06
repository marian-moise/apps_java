package Algorithms;

public class BestTimeToBuyStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int countPr = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                countPr = countPr + (prices[i] - prices[i - 1]);
            }
        }
        return countPr;
    }


}
