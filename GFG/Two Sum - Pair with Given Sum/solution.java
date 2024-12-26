// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        // Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {

            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }
        // If no pair is found
        return false;
    }
}
