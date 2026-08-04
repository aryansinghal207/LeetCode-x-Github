class Solution {
    public List<Integer> findMissingElements(int[] nums){
        int min=nums[0],max=nums[0];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        for (int i = min + 1; i < max; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) ans.add(i);
        }
        return ans;
    }
}