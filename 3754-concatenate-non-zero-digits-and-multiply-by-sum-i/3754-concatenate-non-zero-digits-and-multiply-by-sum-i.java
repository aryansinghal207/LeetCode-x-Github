class Solution {
    public long sumAndMultiply(int n) {
        int num=0,sum=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                num=num*10+digit;
                sum+=digit;
            }
            n=n/10;
        }
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return (long) sum * rev;
    }
}