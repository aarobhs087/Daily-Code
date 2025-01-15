class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<>();

        int preSum = 0;
        int res = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {

            // Add current element to sum
            // if current element is zero, add -1
            preSum += (arr[i] == 0) ? -1 : 1;

            // To handle sum = 0 at last index
            if (preSum == 0)
                res = i + 1;

            // If this sum is seen before, then update 
              // result with maximum
            if (mp.containsKey(preSum))
                res = Math.max(res, i - mp.get(preSum));

            // Else put this sum in hash table
            else
                mp.put(preSum, i);
        }

        return res;
    }
}
