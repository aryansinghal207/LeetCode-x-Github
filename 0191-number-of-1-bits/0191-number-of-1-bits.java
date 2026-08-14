class Solution {
    public int hammingWeight(int n) {
        char[] bin=Integer.toBinaryString(n).toCharArray();
        int cnt=0;
        for(int i=0;i<bin.length;i++){
            if(bin[i]=='1') cnt++;
        }
        return cnt;
    }
}