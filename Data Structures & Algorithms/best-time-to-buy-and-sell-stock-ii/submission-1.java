class Solution {
    public int maxProfit(int[] prices) {
        int maxRes = 0 ;
        int left = 0 ;
        int right = prices.length - 1;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxRes += prices[i + 1] - prices[i];
            }
        }
        return maxRes;
    }
}