// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int prefSum = 0;

        for (int i = 0; i < arr.length; ++i) {
            prefSum += arr[i];

            // Check if the entire prefix sums to k
            if (prefSum == k) 
                res = i + 1;

            // If prefixSum - k exists in the map then there exist such 
              // subarray from (index of previous prefix + 1) to i.
            else if (mp.containsKey(prefSum - k)) 
                res = Math.max(res, i - mp.get(prefSum - k));

            // Store only first occurrence index of prefSum
            if (!mp.containsKey(prefSum))
                mp.put(prefSum, i);
        }

        return res;
    }
}
