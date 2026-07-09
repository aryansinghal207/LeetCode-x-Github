class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,target,ans,new ArrayList<Integer>());
        return ans;
    }
    public void solve(int i,int[] nums,int target,List<List<Integer>> ans,List<Integer> list){
        if(i==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(nums[i]<=target){
            list.add(nums[i]);
            solve(i,nums,target-nums[i],ans,list);
            list.remove(list.size()-1);
        }
        solve(i+1,nums,target,ans,list);
    }
}