// User function Template for Java

class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        int n = arr.length;
        int[] countX = new int[n];
        int[] countY = new int[n];
        Map<Integer, Integer> diffCountMap = new HashMap<>();
        
        // To store counts of same diff
        diffCountMap.put(0, 1); // Initial condition (before any element is processed)
        
        int countXCurrent = 0;
        int countYCurrent = 0;
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            // Update counts of x and y
            if (arr[i] == x) countXCurrent++;
            if (arr[i] == y) countYCurrent++;
            
            // Calculate the difference
            int diff = countXCurrent - countYCurrent;
            
            // If this difference has been seen before, it means there are subarrays 
            // between previous occurrences of this difference and the current index 
            // that have equal x and y occurrences.
            result += diffCountMap.getOrDefault(diff, 0);
            
            // Update the map with the current difference
            diffCountMap.put(diff, diffCountMap.getOrDefault(diff, 0) + 1);
        }
        
        return result;
    }
}
