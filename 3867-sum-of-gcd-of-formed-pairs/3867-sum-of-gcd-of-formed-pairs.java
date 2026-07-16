class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        long ans=0;
        int n=nums.length,max=nums[0];
        int[] pre=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pre[i]=gcd(nums[i],max);
        }
        Arrays.sort(pre);
        int left=0,right=n-1;
        while(left<right){
            ans+=gcd(pre[left],pre[right]);
            left++;right--;
        }
        return ans;
    }
}