class Solution {
    public int maxProduct(int n) {
        int prod=1,first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        while(n>0){
            int digit=n%10;
            if(digit>first){
                second=first;
                first=digit;
            }
            else if(digit>second) second=digit;
            prod=first*second;
            n=n/10;
        }
        return prod;
    }
}