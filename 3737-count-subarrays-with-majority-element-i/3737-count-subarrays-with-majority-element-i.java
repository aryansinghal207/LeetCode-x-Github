class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int freq = 0;
            for (int end = start; end < nums.length; end++) {
                if (nums[end] == target) freq++;
                int len = end - start + 1;
                if (freq > len / 2) count++;
            }
        }
        return count;
    }
}