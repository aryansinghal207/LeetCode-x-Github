class Solution {
    public boolean first(int n){
        if(n>=2 && n<=5) return false;
        return true;
    }
    public boolean second(int n){
        if(n>=4 && n<=7) return false;
        return true;
    }
    public boolean third(int n){
        if(n>=6 && n<=9) return false;
        return true;
    }
    public int maxNumberOfFamilies(int m, int[][] reservedSeats) {
        int cnt=0,n=reservedSeats.length;
        Arrays.sort(reservedSeats,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });
        int r=1;
        boolean fst=true,sec=true,thrd=true;
        for(int i=0;i<n;i++){
            int row=reservedSeats[i][0];
            int col=reservedSeats[i][1];
            if(r!=row){
                if(fst&&thrd) cnt+=2;
                else if(fst) cnt+=1;
                else if(sec) cnt+=1;
                else if(thrd) cnt+=1;
                cnt+=(row-r-1)*2;
                r=row;
                fst=true;sec=true;thrd=true;
            }
            if(fst && !first(col)) fst=false;
            if(sec && !second(col)) sec=false;
            if(thrd && !third(col)) thrd=false;
        }
        if(fst && thrd) cnt+=2;
        else if (fst) cnt++;
        else if (sec) cnt++;
        else if (thrd) cnt++;
        cnt+=(m-r)*2;
        return cnt;
    }
}