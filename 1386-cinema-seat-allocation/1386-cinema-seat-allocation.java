class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int[] r:reservedSeats){
            int row=r[0];
            int seat=r[1];
            map.putIfAbsent(row,new HashSet<>());
            map.get(row).add(seat);
        }
        int result=(n-map.size())*2;
        for(HashSet<Integer> s:map.values()){
            boolean A=!s.contains(2)&&!s.contains(3)&&!s.contains(4)&&!s.contains(5);
            boolean B=!s.contains(4)&&!s.contains(5)&&!s.contains(6)&&!s.contains(7);
            boolean C=!s.contains(6)&&!s.contains(7)&&!s.contains(8)&&!s.contains(9);
            if(A&&C) result+=2;
            else if(A||B||C) result+=1;
        }
        return result;
    }
}