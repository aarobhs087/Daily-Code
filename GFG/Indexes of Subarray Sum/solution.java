class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        // Initialize window
        int s = 0, e = 0;  
        ArrayList<Integer> res = new ArrayList<>();

        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];

            // If current sum becomes more or equal,
            // set end and try adjusting start
            if (curr >= target) {
                e = i;

                // While current sum is greater, 
                // remove starting elements of current window
                while (curr > target && s < e) {
                    curr -= arr[s];
                    ++s;
                }

                // If we found a subarray
                if (curr == target) {
                    res.add(s + 1);
                    res.add(e + 1);
                    return res;
                }
            }
        }
        // If no subarray is found
        res.add(-1);
        return res;
    }
}
