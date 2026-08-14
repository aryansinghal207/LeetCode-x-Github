class Solution {
    public int maximumLengthSubstring(String s){
        int[] freq=new int[26];
        int i=0,maxlen=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            freq[c-'a']++;
            while(freq[c-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}