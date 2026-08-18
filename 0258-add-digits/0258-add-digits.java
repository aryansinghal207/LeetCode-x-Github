class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        while(num>=10){
            num=solve(num);
        }
        return num;
    }
    private int solve(int num){
        int n=num,ans=0;
        while(n>0){
            int temp=n%10;
            ans+=temp;
            n=n/10;
        }
        return ans;
    }
}