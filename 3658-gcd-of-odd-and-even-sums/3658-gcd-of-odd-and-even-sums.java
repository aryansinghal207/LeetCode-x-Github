class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        for(int i=1;i<=n*2;i+=2){
            odd+=i;
            even+=i+1;
        }
        return gcd(odd,even);
    }
}