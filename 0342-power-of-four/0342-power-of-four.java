class Solution {
    public boolean isPowerOfFour(int n){
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        while(n>1){
            if(n%4!=0) return false;
            n/=4;
        }
        return true;
    }
}