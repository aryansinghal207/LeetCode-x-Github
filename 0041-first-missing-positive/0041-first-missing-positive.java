class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length,ans=0;
        int[] freq=new int[n+2];
        for(int num:nums){
            if(num>= 0 && num<= n) freq[num]++;
        }
        for (int i=1;i<freq.length;i++) {
            if (freq[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}