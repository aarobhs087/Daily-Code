class Solution {
    public int minimizeCost(int k, int heights[]) {
        // code here
        int n=heights.length;
        Map<Integer, Integer> dp = new HashMap<>();
 
        // Cost of reaching the first stone is zero
        dp.put(heights[0], 0);
 
        // Loop over the stones and calculate the minimum cost to reach each stone
        for (int i = 1; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
 
            // Loop over the previous k stones and find the minimum cost to reach the current stone
            for (int j = i - 1; j >= Math.max(0, i - k); j--) {
                int cost = dp.get(heights[j]) + Math.abs(heights[i] - heights[j]);
                minCost = Math.min(minCost, cost);
            }
 
            // Store the minimum cost to reach the current stone in the hash table
            dp.put(heights[i], minCost);
        }
 
        // Return the minimum cost to reach the last stone
        return dp.get(heights[n - 1]);
    }
}
