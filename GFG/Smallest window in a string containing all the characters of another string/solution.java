class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        int m = s.length();
        int n = p.length();

        // If s is smaller than p, it's impossible
        if (m < n)
            return "-1";

        int minLength = Integer.MAX_VALUE;

        // Lower bound and Upper Bound for Binary Search
        // The smallest valid window size is n (size of p)
        int low = n, high = m;

        // Stores starting index of the min-length substring
        int idx = -1;

        // Applying Binary Search on the answer
        while (low <= high) {
            int mid = (low + high) / 2;
            int[] start = new int[1];

            // If a substring of length mid is found which
            // contains all the characters of p, then
            // update minLength and high, otherwise update
            // low
            if (isValid(s, p, mid, start)) {
                if (mid < minLength) {
                    minLength = mid;
                    idx = start[0];
                }
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if (idx == -1)
            return "-1";

        return s.substring(idx, idx + minLength);
    }
     static boolean isValid(String s, String p, int mid,
                           int[] start)
    {
        // Count the frequency of each character in p
        int[] count = new int[256];
        Arrays.fill(count, 0);

        // Stores number of distinct characters in p
        int distinct = 0;

        // Count the frequency of each character in p
        for (char x : p.toCharArray()) {
            if (count[x] == 0)
                distinct++;
            count[x]++;
        }

        // Stores the number of characters in a substring of
        // size mid in s whose frequency is the same as the
        // frequency in p
        int curr_count = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]--;
            if (count[s.charAt(i)] == 0) {
                curr_count++;
            }

            // Slide the window: remove the effect of the
            // character that is out of the current window
            if (i >= mid) {
                count[s.charAt(i - mid)]++;
                if (count[s.charAt(i - mid)] == 1) {
                    curr_count--;
                }
            }

            // Check if the current window contains all
            // characters of p
            if (i >= mid - 1) {
                if (curr_count == distinct) {
                    start[0] = (i - mid) + 1;
                    return true;
                }
            }
        }

        return false;
    }
}
