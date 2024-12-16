// User function Template for Java
class Solution {
    // function to check if we can place k cows
    // with at least dist distance apart
    static boolean check(int[] stalls, int k, int dist) {
        
        // Place first cow at 0th index
        int cnt = 1;  
        int prev = stalls[0]; 
        for (int i = 1; i < stalls.length; i++) {
            
            // If the current stall is at least dist away
            // from the previous one place the cow here
            if (stalls[i] - prev >= dist) {
                prev = stalls[i]; 
                cnt++;
            }
        }

        // Return true if we are able to place all 'k' cows
        return (cnt >= k);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        // sorting the array to ensure stalls in sequence
        Arrays.sort(stalls);
        int res = 0; 
        
        // Search Space for Binary Search
        int lo = 1;
        int hi = stalls[stalls.length - 1] - stalls[0]; 

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            // If the mid distance is possible, update
            // the result and search for larger distance
            if(check(stalls, k, mid)) {
                res = mid;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        
        return res;
    }
}
