class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length,ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        if (k == n) {
            for (int num : nums)
                ans = Math.max(ans, num);
            return ans;
        }
        if (k == 1) {
            for (int num : nums) {
                if (map.get(num) == 1)
                    ans = Math.max(ans, num);
            }
            return ans;
        }
        int st=nums[0],end=nums[n-1];
        if (map.get(st) == 1) 
            ans = Math.max(ans, st);
        if (map.get(end) == 1) 
            ans = Math.max(ans, end);
        return ans;
    }
}