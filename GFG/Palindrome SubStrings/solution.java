class Solution {
    public int countPS(String s) {
        // code here
         int n = s.length();
        int count = 0;

        // Count odd length palindrome substrings 
        // with str[i] as center.
        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < n) {
                if (s.charAt(left) == s.charAt(right))
                    count++;
                else
                    break;
                left--;
                right++;
            }
        }

        // Count even length palindrome substrings
        // where str[i] is first center.
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < n) {
                if (s.charAt(left) == s.charAt(right))
                    count++;
                else
                    break;
                left--;
                right++;
            }
        }
        return count;
    }
}
