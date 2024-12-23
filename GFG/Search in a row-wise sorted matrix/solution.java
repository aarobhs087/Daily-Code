class Solution {
    static boolean search(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            // If x == mid, return true
            if (x == arr[mid])
                return true;

            // If x < arr[mid], search in the left half
            if (x < arr[mid])
                hi = mid - 1;

            // If x > arr[mid], search in the right half
            else
                lo = mid + 1;
        }
        return false;
    }
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
         int n = mat.length, m = mat[0].length;

        // Iterate over all the rows to find x
        for (int i = 0; i < n; i++) {

            // Perform binary search on the ith row
            if (search(mat[i], x))
                return true;
        }

        // If x was not found, return false
        return false;
    }
}
