class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length,count=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1) count+=nums[i];
            else break;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        while(set.contains(count)) count++;
        return count;
    }
}