class Solution {
    public int findLucky(int[] arr){
        int max = 0;
        for (int num : arr) max = Math.max(max, num);
        int n=arr.length;
        int[] freq=new int[max+1];
        for(int num:arr) freq[num]++;
        for(int i=max;i>=1;i--){
            if(freq[i]==i) return i;
        }
        return -1;
    }
}