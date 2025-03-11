class Solution {
    void multiply(int[][] a, int[][] b) {
        
        // Matrix to store the result
        int[][] res = new int[2][2];

        // Matrix Multiplication
        res[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        res[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        res[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        res[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];

        // Copy the result back to the first matrix
        a[0][0] = res[0][0];
        a[0][1] = res[0][1];
        a[1][0] = res[1][0];
        a[1][1] = res[1][1];
    }

    int[][] power(int[][] m, int expo) {
        
        // Initialize result with identity matrix
        int[][] res = { { 1, 0 }, { 0, 1 } };

        while (expo > 0) {
            if ((expo & 1) == 1)
                multiply(res, m);
            multiply(m, m);
            expo >>= 1;
        }

        return res;
    }
    int countWays(int n) {
        // your code here
          // base case
        if (n == 0 || n == 1)
            return 1;

        int[][] m = { { 1, 1 }, { 1, 0 } };
        
        // Matrix initialMatrix = {{f(1), 0}, {f(0), 0}}, where f(0)
        // and f(1) are first two terms of sequence
        int[][] initialMatrix = { { 1, 0 }, { 1, 0 } };

        // Multiply matrix m (n - 1) times
        int[][] res = power(m, n - 1);

        multiply(res, initialMatrix);

        return res[0][0];
    }
}
