class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        Stack<Character> st=new Stack<>();
        boolean[] vis=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vis[ch-'a']) continue;
            while(!st.isEmpty() && st.peek()>ch && last[st.peek()-'a']>i) 
            vis[st.pop()-'a']=false;
            st.push(ch);
            vis[ch-'a']=true;
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st) ans.append(ch);
        return ans.toString();
    }
}