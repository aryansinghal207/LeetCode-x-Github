class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int total=m*n;
        k%=total;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            ans.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int old=i*n+j;
                int newpos=(old+k)%total;
                int newrow=newpos/n;
                int newcol=newpos%n;
                ans.get(newrow).set(newcol,grid[i][j]);
            }
        }
        return ans;
    }
}