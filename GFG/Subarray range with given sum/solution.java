// User function Template for Java

class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        for (int num : arr) {
            // Add current element to the cumulative sum
            currentSum += num;

            // Check if current sum itself is equal to target
            if (currentSum == tar) {
                count++;
            }

            // Check if (currentSum - tar) exists in the prefix sum map
            if (prefixSumMap.containsKey(currentSum - tar)) {
                count += prefixSumMap.get(currentSum - tar);
            }

            // Update prefix sum map with current cumulative sum
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
