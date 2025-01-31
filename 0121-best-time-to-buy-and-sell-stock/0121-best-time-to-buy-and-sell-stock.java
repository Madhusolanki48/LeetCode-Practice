class Solution {
    public int maxProfit(int prices[]) { 
        int buyPrices = Integer.MAX_VALUE;
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrices < prices[i]) { // profit
                int profit = prices[i] - buyPrices; // today's profit
                maxPro = Math.max(maxPro, profit);
            } else {
                buyPrices = prices[i];
            }
        }
        return maxPro;
    }
}
