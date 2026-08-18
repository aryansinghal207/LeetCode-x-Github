class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int st=nums[i];
            while(i<n-1 && nums[i]+1==nums[i+1]) i++;
            int end=nums[i];
            if(st==end) ans.add(Integer.toString(st));
            else{
                StringBuilder sb=new StringBuilder();
                sb.append(st+"->"+end);
                ans.add(sb.toString());
            }
        }
        return ans;
    }
}