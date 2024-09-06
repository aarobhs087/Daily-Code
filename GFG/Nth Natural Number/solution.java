// User function Template for Java

class Solution {
    long findNth(long n) {
        // code here
        long result = 0;
        long p = 1;
        while (n > 0) {
            result += (p * (n % 9));
            n = n / 9;
            p = p * 10;
        }
        return result;
    }
}
