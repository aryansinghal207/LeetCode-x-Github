class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int num:nums1) set1.add(num);
        for(int n:nums2){
            if(set1.contains(n)) set2.add(n);
        }
        int x=set2.size(),a=0;
        int[] ans=new int[x];
        for(int n:set2){
            ans[a]=n;
            a++;
        }
        return ans;
    }
}