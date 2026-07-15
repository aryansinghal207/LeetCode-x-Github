class Solution {
    public boolean validateStackSequences(int[] pus, int[] pop) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=0;i<pus.length;i++){
            st.push(pus[i]);
            while(!st.isEmpty() && st.peek()==pop[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}