// User function Template for Java

class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        // Sort the array
       Arrays.sort(arr);
        long mod = 1000000007;
        long sum = 0;
        
        // Iterate from the end of the array to get the maximum values in high indices
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (arr[i] * (long)i) % mod) % mod;
        }
        
        return (int)sum;
    }
}
