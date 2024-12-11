// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < n + m) {
              
                // If both pointers are in the first array a[]
                if (j < n && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } 
              
                // If first pointer is in a[] and 
                // the second pointer is in b[]
                else if (i < n && j >= n && a[i] > b[j - n]) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                } 
              
                // Both pointers are in the second array b
                else if (i >= n && b[i - n] > b[j - n]) {
                    int temp = b[i - n];
                    b[i - n] = b[j - n];
                    b[j - n] = temp;
                }
                i++;
                j++;
            }

            // After operating for gap of 1 break the loop
            if (gap == 1) break;

            // Calculate the next gap
            gap = (gap + 1) / 2;
        }
    }
}
