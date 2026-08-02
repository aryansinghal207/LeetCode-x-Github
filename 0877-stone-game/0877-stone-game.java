class Solution {
    public boolean stoneGame(int[] piles) {
        int count=0,n=piles.length;
        for(int pile:piles) count+=pile;
        // Calculated the sum of total array so that we could return winner.
        Integer[][] dp = new Integer[n][n];
        int alice=helper(piles,0,n-1,dp);
        return alice>count/2; 
    }

    private int helper(int[] arr,int i,int j,Integer[][] dp){
        if(i>j) return 0; //Base case
        if(i==j) return arr[i]; //Success Condition
        if (dp[i][j] != null) return dp[i][j];
        int left=arr[i]+Math.min(helper(arr,i+2,j,dp),helper(arr,i+1,j-1,dp)); // We have used min because both want to win and will choose the maximum value on there turn and minimums will be left out

        int right=arr[j]+Math.min(helper(arr,i+1,j-1,dp),helper(arr,i,j-2,dp));

        return dp[i][j]=Math.max(left,right);
    }
}