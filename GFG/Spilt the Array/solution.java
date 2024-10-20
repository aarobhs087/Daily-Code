// User function Template for Java

class Solution {

    public static int countgroup(int a[]) {
        // Complete the function
        int n=a.length;
         int xs = 0;
    for (int i = 0; i < n; i++)
    xs = xs ^ a[i];
    // We can split only if XOR is 0. Since
    // XOR of all is 0, we can consider all
    // subsets as one group.
    if (xs == 0)
    return (1 << (n - 1)) - 1;
 
    return 0;
    }
}
