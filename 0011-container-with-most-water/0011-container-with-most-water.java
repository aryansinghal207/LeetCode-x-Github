class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1,prod=0;
        while(l<=r){
            int pro=(r-l)*Math.min(height[l],height[r]);
            prod=Math.max(prod,pro);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return prod;
    }
}