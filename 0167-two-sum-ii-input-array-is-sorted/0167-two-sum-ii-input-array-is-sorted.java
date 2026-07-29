class Solution {
    public int[] twoSum(int[] num, int target) {
        int n=num.length;
        int st=0,end=n-1;
        int[] ans=new int[2];
        while(st<end){
            int sum=num[st]+num[end];
            if(sum<target) st++;
            else if(sum>target) end--;
            else return new int[]{st + 1, end + 1};
        }
        return new int[]{-1, -1};
    }
}