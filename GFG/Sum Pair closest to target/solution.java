// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        int left = 0, right = n - 1;

        while (left < right) {
            int currSum = arr[left] + arr[right];

            // Check if this pair is closer than the closest
            // pair so far
            if (Math.abs(target - currSum) < minDiff) {
                minDiff = Math.abs(target - currSum);
                res = Arrays.asList(arr[left], arr[right]);
            }

            // If this pair has less sum, move to greater values
            if (currSum < target)
                left++;

            // If this pair has more sum, move to smaller values
            else if (currSum > target)
                right--;

            // If this pair has sum = target, return it
            else
                return res;
        }

        return res;
    }
}
