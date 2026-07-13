class Solution {
    private boolean issequential(int i){
        while(i>=10){
            int digit=i%10;
            int secondlast=(i/10)%10;
            if(secondlast+1!=digit) return false;
            i/=10;
        }
        return true;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        String s="123456789";
        for(int len=2;len<=9;len++){
            for(int st=0;st+len<=9;st++){
                int num=Integer.parseInt(s.substring(st,st+len));
                if(num>=low && num<=high) ans.add(num);
            }
        }
        return ans;
    }
}