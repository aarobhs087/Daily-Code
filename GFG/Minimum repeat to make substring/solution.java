// User function Template for Java

class Solution {
    // function to compute the LPS Array
    static void computeLPSArray(String s, int[] lps) {
        int len = 0, idx = 1;

        // lps[0] is always 0
        lps[0] = 0;

        // the loop calculates lps[i] for
        // i = 1 to str.length() - 1
        while (idx < s.length()) {
            if (s.charAt(idx) == s.charAt(len)) {
                len++;
                lps[idx] = len;
                idx++;
            } 
            else {
                
                // If len is 0, then we have no common prefix
                // which is also a suffix
                if (len == 0) {
                    lps[idx] = 0;
                    idx++;
                } 
                else {
                  
                    // Note that we do not move to the next index
                    len = lps[len - 1];
                }
            }
        }
    }

    // function to find the occurrence of pat in txt
    static boolean KMPSearch(String txt, String pat, int[] lps, int rep) {
        int n = txt.length(), m = pat.length();
        int i = 0, j = 0;

        // Iterate till s1 is repeated rep times
        while (i < n * rep) {
            
            // If characters match, move both pointers forward
            if (txt.charAt(i % n) == pat.charAt(j)) {
                i++;
                j++;

                // If the entire pattern is matched
                if (j == m) {
                    return true;
                }
            } 
            else {
                
                // If there is a mismatch
                // Use lps value of previous index to avoid redundant comparisons
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return false;
    }

    static int minRepeats(String s1, String s2) {
        // code here
        // Find lengths of strings
        int n = s1.length();
        int m = s2.length();

        // Declare and Compute the LPS Table
        int[] lps = new int[m];
        computeLPSArray(s2, lps);

        // Find the minimum number of times s1 needs to be
        // repeated to become as long as s2
        int x = (m + n - 1) / n;

        // Check when string s1 is repeated x times
        if (KMPSearch(s1, s2, lps, x))
            return x;

        // Check when string s1 is repeated (x + 1) times
        if (KMPSearch(s1, s2, lps, x + 1))
            return x + 1;

        // If string s2 was not found, return -1
        return -1;
    }
};
