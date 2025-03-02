class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        int n = arr.length;

        // to store the results
        ArrayList<Integer> res = new ArrayList<Integer>();

        // create deque to store max values
        Deque<Integer> dq = new ArrayDeque<Integer>();

        // Process first k (or first window) elements of array
        for (int i = 0; i < k; ++i) {
          
            // For every element, the previous smaller elements 
            // are useless so remove them from dq
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
              
                // Remove from rear
                dq.pollLast();
            }

            // Add new element at rear of queue
            dq.addLast(i);
        }

        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (int i = k; i < arr.length; ++i) {
          
            // The element at the front of the queue is the largest 
            // element of previous window, so store it
            res.add(arr[dq.peekFirst()]);

            // Remove the elements which are out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
              
                // Remove from front of queue
                dq.pollFirst();
            }

            // Remove all elements smaller than the currently being 
            // added element (remove useless elements)
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }

            // Add current element at the rear of dq
            dq.addLast(i);
        }

        // store the maximum element of last window
        res.add(arr[dq.peekFirst()]);

        return res;
    }
}
