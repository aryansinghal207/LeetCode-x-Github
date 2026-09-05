class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] mini = new int[n];
        mini[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mini[i] = Math.min(nums[i], mini[i + 1]);
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
            int score = maxi - mini[i];
            if (score <= k) {
                return i;
            }
        }
        return -1;
    }
}