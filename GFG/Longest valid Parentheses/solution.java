//User function Template for Java

class Solution{
    static int maxLength(String s){
        // code here
        int open = 0, close = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')    open++;
            else    close++;
            if (open == close)  max = Math.max(max, open + close);
            else if (close > open)    open = close = 0;
        }
        open = close = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '(')    open++;
            else    close++;
            if (open == close)    max = Math.max(max, open + close);
            else if (open > close)    open = close = 0;
        }
        return max;
    }
}
