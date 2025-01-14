class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefSum = 0, total = 0;

        // Calculate the array sum
        for (int ele : arr) {
            total += ele;
        }

        // Iterate pivot over all the elements of the array
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }

        // There is no equilibrium point
        return -1;
    }
}
