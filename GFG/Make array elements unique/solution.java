
// User function Template for Java

class Solution {
    public int minIncrements(int[] A) {
        // Code here
        Arrays.sort(A);
       
          // counter for no of operations
        int ops = 0;
       
          // iterate over the array
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i-1]) {
                ops += A[i-1] - A[i] + 1;
                A[i] = A[i-1] + 1;
            }
        }
       
          // return no of operations required
        return ops;
        
    }
}
