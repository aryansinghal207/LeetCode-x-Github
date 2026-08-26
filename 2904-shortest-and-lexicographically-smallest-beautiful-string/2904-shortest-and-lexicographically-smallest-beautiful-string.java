class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        List<Integer> one=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') one.add(i);
        } 
        if(one.size()<k) return "";
        String ans="";
        for(int i=0;i+k-1<one.size();i++){
            int left=one.get(i),right=one.get(i+k-1);
            String sub=s.substring(left,right+1);
            if(ans.equals("")|| sub.length()<ans.length()|| (sub.length()==ans.length() && sub.compareTo(ans) < 0)){
                ans=sub;
            }
        }
        return ans;
    }
}