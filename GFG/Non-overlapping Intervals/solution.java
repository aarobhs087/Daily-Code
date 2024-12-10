// User function Template for Java

class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int cnt = 0;

        // Sort by minimum ending point
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // if there is an overlap increase the count
            if (intervals[i][0] < end)
                cnt++;

            // else increment the ending point
            else
                end = intervals[i][1];
        }

        // return the count
        return cnt;
    }
}
