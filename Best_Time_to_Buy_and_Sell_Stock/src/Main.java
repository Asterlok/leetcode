public class Main {
    public static void main(String[] args) {
        int[] prices = {6, 4, 6, 1 , 2, 3};
        int rez = Solution.maxProfit(prices);
        System.out.println(rez);
    }
}

class Solution {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) return 0;
        int profit = 0;
        for (int i = 0; i < len - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += (prices[i + 1] - prices[i]);
            }
        }
        return profit;
    }
}