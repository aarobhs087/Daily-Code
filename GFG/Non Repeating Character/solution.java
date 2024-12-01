// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        for(char c:s.toCharArray()) {
            if(s.indexOf(c)==s.lastIndexOf(c)) {
                return c;
            }
        }
        return '$';
    }
}
