class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq = new int[nums.length + 1];
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) freq[num]++;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > 1) {
                ans.add(i);
            }
        }
        return ans;
    }
}