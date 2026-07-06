class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = n;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });
        int maxEnd = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][1] <= maxEnd) {
                count--;
            } else {
                maxEnd = intervals[i][1];
            }
        }
        return count;
    }
}