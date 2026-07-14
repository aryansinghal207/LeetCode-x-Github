class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()) map1.put(c,map1.getOrDefault(c,0)+1);
        for(char c:target.toCharArray()) map2.put(c,map2.getOrDefault(c,0)+1);
        int ans=Integer.MAX_VALUE;
        for(char c:map2.keySet()) ans=Math.min(ans,map1.getOrDefault(c,0)/map2.get(c)); 
        return ans;
    }
}