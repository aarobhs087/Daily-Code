// User function Template for Java

class Solution {
    final int MAX_CHAR = 26;
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int res = 0;

        // last index of all characters is initialized as -1
        int[] lastIndex = new int[MAX_CHAR];
        for (int i = 0; i < MAX_CHAR; i++) {
            lastIndex[i] = -1;
        }

        // Initialize start of current window
        int start = 0;

        // Move end of current window
        for (int end = 0; end < n; end++) {

            // Find the last index of s[end]
            // Update starting index of current window as
            // maximum of current value of end and last index + 1
            start = Math.max(start, lastIndex[s.charAt(end) - 'a'] + 1);

            // Update result if we get a larger window
            res = Math.max(res, end - start + 1);

            // Update last index of s[end]
            lastIndex[s.charAt(end) - 'a'] = end;
        }
        return res;
    }
}
