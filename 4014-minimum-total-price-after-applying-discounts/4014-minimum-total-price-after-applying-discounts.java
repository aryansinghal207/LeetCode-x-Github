class Solution {
    public double minPrice(int[] prices, int[] discounts){
        int n=prices.length,m=discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;
        int idx=Math.min(n,m);
        for(int i=0;i<idx;i++){
            int price=prices[n-1-i];
            int dis=discounts[m-1-i];
            sum+=(price*(100.0-dis))/100.0;
        }
        for (int i=0;i<n-idx;i++) sum += prices[i];
        return sum;
    }
}