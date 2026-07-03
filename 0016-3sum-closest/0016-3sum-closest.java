class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closestsum=nums[2]+nums[1]+nums[0];
        for(int i=0;i<n-2;i++){
            int st=i+1,end=n-1;
            while(st<end){
                int sum=nums[i]+nums[st]+nums[end];
                if(Math.abs(sum-target)<Math.abs(target-closestsum)){
                    closestsum=sum;
                }
                if(sum>target) end--;
                else st++;
            }
        }
        return closestsum;
    }
}