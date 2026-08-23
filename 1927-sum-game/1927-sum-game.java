class Solution {
    public boolean sumGame(String nums){
        int n=nums.length();
        int leftsum=0,rightsum=0,leftq=0,rightq=0;
        for(int i=0;i<n/2;i++){
            if(nums.charAt(i)=='?') leftq++;
            else leftsum+=nums.charAt(i)-'0';
        }
        for(int i=n/2;i<n;i++){
            if(nums.charAt(i)=='?') rightq++;
            else rightsum+=nums.charAt(i)-'0';
        }
        if((leftq+rightq)%2!=0) return true;
        int diff = leftsum - rightsum;
        int qdiff = leftq - rightq;
        return diff != -9 * qdiff / 2;
    }
}