class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,k=0;
        int[] ans=new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else ans[k++]=nums2[j++];
        } 
        while(i<n){
            ans[k++]=nums1[i++];
        }
        while(j<m){
            ans[k++]=nums2[j++];
        }
        int total=m+n;
        if(total%2==1){
            int mid=total/2;
            return ans[mid];
        }
        int mid1=total/2;
        int mid2=mid1-1;
        return (ans[mid1]+ans[mid2])/2.0;
    }
}