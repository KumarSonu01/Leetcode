class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int profit = prices[i] - min;  // profit if sold today
            maxProfit = Math.max(maxProfit, profit);  // update max profit
        }

        return maxProfit;
    }
}
