class Solution {
    public boolean hasAlternatingBits(int n) {
        char[] bin = Integer.toBinaryString(n).toCharArray();
        for(int i=1;i<bin.length;i++){
            if(bin[i]==bin[i-1]) return false;
        }        
        return true;
    }
}