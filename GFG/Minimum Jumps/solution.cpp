class Solution {
  public:
    int minJumps(vector<int>& arr) {
        // Your code here
        int n = arr.size();
        
        // If array has only one element, you're already at the end
        if (n <= 1) return 0;
        
        // If the first element is 0, it's not possible to move forward
        if (arr[0] == 0) return -1;

        // Initialize variables
        int jumps = 1;  // To count the minimum number of jumps
        int maxReach = arr[0];  // The farthest we can reach initially
        int steps = arr[0];  // Number of steps we can still take in the current jump

        // Traverse the array
        for (int i = 1; i < n; i++) {
            // If we've reached the end of the array
            if (i == n - 1) return jumps;

            // Update the farthest point we can reach
            maxReach = max(maxReach, i + arr[i]);

            // Use one step to move forward
            steps--;

            // If no more steps are left, we must jump
            if (steps == 0) {
                jumps++;

                // If the current index is beyond the maxReach, we can't reach the end
                if (i >= maxReach) return -1;

                // Re-initialize the steps for the new jump
                steps = maxReach - i;
            }
        }

        return -1;
    }
};
