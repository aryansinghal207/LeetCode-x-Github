class Solution {
    public int minimumPushes(String word) {
        int n=word.length(),count=0,idx=0;
        int[] frequency=new int[26]; // Alphabetic frequency Array
        for(char ch:word.toCharArray()) 
            frequency[ch-'a']++; //Storing the value in frequency array

        Arrays.sort(frequency); // We have sorted so that we could have the maximum value at the last

        for(int i=25;i>=0;i--){  // We have used reversed loop so that we could assign the maximum freq the minimum number so that we could minimum number of pushes. For ex : B:100 the it count only 100.
            if(frequency[i]==0) break;
            int push=(idx/8)+1;
            count+=frequency[i]*push;
            idx++;
        }
        return count;
    }
}