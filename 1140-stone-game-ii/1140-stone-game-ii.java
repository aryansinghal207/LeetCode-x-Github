class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n + 1];
        int[] suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) suffix[i] = suffix[i + 1] + piles[i];
        int diff = helper(0, 1, n, suffix, dp);
        return (suffix[0] + diff) / 2;
    }
    private int helper(int i, int m, int n, int[] suffix, int[][] dp){
        if (dp[i][m] != 0) return dp[i][m];
        if (2 * m >= n - i) return suffix[i];
        int best = Integer.MIN_VALUE;
        for (int x = 1; x <= 2 * m; x++) {
            int taken = suffix[i] - suffix[i + x];
            int next = Math.max(m, x);
            int current = taken - helper(i + x, next, n, suffix, dp);
            best = Math.max(best, current);
        }
        dp[i][m] = best;
        return best;
    }
}