class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.max(house(0,dp,nums),house(1,dp,nums));
    }
    private int house(int st,int[] dp,int[] arr){
        if(st>=arr.length) return 0;
        if(dp[st]!=-1) return dp[st];
        int take=arr[st]+house(st+2,dp,arr);
        int nottake=house(st+1,dp,arr);
        return dp[st]=Math.max(take,nottake);
    }
}