class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        // dp[i][j] stores the maximum score difference
        // the current player can achieve from nums[i...j]
        Integer[][] dp = new Integer[n][n];

        // If Player 1's score difference is >= 0,
        // then Player 1 can win or at least tie.
        return solve(nums, 0, n - 1, dp) >= 0;
    }

    private int solve(int[] nums, int left, int right, Integer[][] dp) {

        // Only one element left, current player takes it.
        if (left == right) return nums[left];

        // Return already computed answer.
        if (dp[left][right] != null) return dp[left][right];

        // Pick the left element.
        int takeLeft = nums[left] - solve(nums, left + 1, right, dp);

        // Pick the right element.
        int takeRight = nums[right] - solve(nums, left, right - 1, dp);

        // Choose the option that gives the maximum score difference.
        return dp[left][right] = Math.max(takeLeft, takeRight);
    }
}