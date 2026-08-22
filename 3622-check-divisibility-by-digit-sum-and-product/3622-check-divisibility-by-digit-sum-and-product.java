class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1,num=n;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n=n/10;
        }
        return num%(sum+prod)==0;
    }
}