class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
    public void solve(int[] nums,int curr,List<List<Integer>> ans){
        if(curr==nums.length){
            List<Integer> arr=new ArrayList<>();
            for(int num:nums){
                arr.add(num);
            }    
            ans.add(arr);
            return;
        }
        for(int i=curr;i<nums.length;i++){
            swap(nums,curr,i);
            solve(nums,curr+1,ans);
            swap(nums,curr,i);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}