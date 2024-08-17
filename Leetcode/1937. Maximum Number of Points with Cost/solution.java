class Solution {
    public long maxPoints(int[][] points) {
        int m = points[0].length;
        long[] curr = new long[m], prev = new long[m];
        for (int[] row : points) {
            long max = 0;
            for (int i = 0; i < m; ++i) {
                max = Math.max(max - 1, prev[i]);
                curr[i] = max;
            }
            max = 0;
            for (int i = m - 1; i >= 0; --i) {
                max = Math.max(max - 1, prev[i]);
                curr[i] = Math.max(curr[i], max) +  row[i];
            }
            prev = curr;
        }
        long ans = 0;
        for (int i = 0; i < m; ++i)    ans = Math.max(ans, prev[i]);
        return ans;
    }
}
