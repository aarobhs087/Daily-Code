// User function Template for Java
class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
        // Edge case: If array has only one tower, no modification needed
        if (arr.length == 1) {
            return 0;
        }
        
        // Step 1: Sort the array
        Arrays.sort(arr);
        int n = arr.length;
        
        // Step 2: Calculate the initial difference between tallest and shortest tower
        int result = arr[n - 1] - arr[0];
        
        // Initialize smallest and largest after first adjustments
        int small = arr[0] + k;
        int large = arr[n - 1] - k;
        
        // Ensure small is the smaller value
        if (small > large) {
            int temp = small;
            small = large;
            large = temp;
        }
        
        // Step 3: Iterate through the array and calculate the minimum difference
        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(small, arr[i + 1] - k);
            int maxHeight = Math.max(large, arr[i] + k);
            result = Math.min(result, maxHeight - minHeight);
        }
        
        return result;
    }
}
