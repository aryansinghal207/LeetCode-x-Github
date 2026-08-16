class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] frequency = new int[3];
        for (int stone : stones) frequency[stone % 3]++;
        int zero = frequency[0];
        int one = frequency[1];
        int two = frequency[2];
        if (Math.min(one, two) == 0) return Math.max(one, two) > 2 && zero % 2 == 1;
        return Math.abs(one - two) > 2 || zero % 2 == 0;
    }
}