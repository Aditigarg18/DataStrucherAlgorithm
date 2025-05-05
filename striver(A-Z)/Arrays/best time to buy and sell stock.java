class Solution {
    public int maxProfit(int[] prices) {
        int maxright=0;
        int maxprofit=0;
        for(int i=prices.length-1;i>=0;i--){
            maxright=Math.max(maxright,prices[i]);
            maxprofit=Math.max(maxprofit,maxright-prices[i]);
        }
        return maxprofit;
    }
}
