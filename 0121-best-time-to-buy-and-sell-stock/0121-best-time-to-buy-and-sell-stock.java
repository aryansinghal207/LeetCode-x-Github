class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0],maxprofit=0;
        for(int i=1;i<n;i++){
            if(prices[i]<min) min=prices[i];
            maxprofit=Math.max(maxprofit,prices[i]-min);
        }
        return maxprofit;
    }
}