// User function Template for Java
class Solution {
    int binarySearch(int[] arr, int complement) {
        int lo = 0, hi = arr.length - 1;
        int res = arr.length;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] >= complement) {
                res = mid;
                hi = mid - 1;
            } 
              else {
                lo = mid + 1;
            }
        }
        return res;
    }

    int countPairs(int[] arr, int target) {
        int cnt = 0;

        // Sort the array to use binary search
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Index of the element which is greater 
            // or equal to the complement
            int ind = binarySearch(arr, complement);

            // arr[i] will make valid pairs with  
            // each element before the index 'ind'
            cnt += ind;

            // If element has made a pair with itself
            if (ind > i)
                cnt--;
        }

        // Each pair is counted twice
        return cnt / 2;
    }
}
