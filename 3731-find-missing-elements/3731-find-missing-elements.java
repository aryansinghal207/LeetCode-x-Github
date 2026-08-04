class Solution {
    public List<Integer> findMissingElements(int[] nums){
        int min=nums[0],max=nums[0];
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>(); // To improve the TC we have used HashSet
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
            set.add(nums[i]);
        }
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}