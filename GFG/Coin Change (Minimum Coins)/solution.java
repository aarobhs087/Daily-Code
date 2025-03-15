class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        // Array to store the minimum coins needed for
        // each value up to sum
        int[] dp = new int[sum + 1];
        
        // Initialize the dp array with a large value (infinity)
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        // Base case: 0 coins are needed to make the sum of 0
        dp[0] = 0;
        
        // Iterate through each coin in reverse order
        for (int i = coins.length - 1; i >= 0; i--) {
            
            // Iterate through all sums from 1 to the target sum
            for (int j = 1; j <= sum; j++) {
                
                // Initialize variables to track taking 
                // or not taking the coin
                int take = Integer.MAX_VALUE, noTake = Integer.MAX_VALUE;
                
                // If we can take the current coin
                if (j - coins[i] >= 0 && coins[i] > 0) {
                    take = dp[j - coins[i]];
                    
                    // If taking the coin is possible,
                    // increment the count
                    if (take != Integer.MAX_VALUE) take++;
                }
                
                // If there are more coins available,
                // consider not taking the current coin
                if (i + 1 < coins.length)
                    noTake = dp[j];
                
                // Store the minimum of taking or 
                // not taking the coin
                dp[j] = Math.min(take, noTake);
            }
        }
        
        // Return the minimum coins needed for 
        // the target sum, or -1 if not possible
        return dp[sum] != Integer.MAX_VALUE ? dp[sum] : -1;
    }
}
