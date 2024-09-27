# // User function template for JAVA

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a, b) -> b.value - a.value);
        for (int i = 0; i < k; i++) {
            heap.offer(new Pair(arr[i], i));
        }

        ans.add(heap.peek().value);

        for (int i = k; i < arr.length; i++) {
            heap.offer(new Pair(arr[i], i));

            while (heap.peek().index <= i - k) {
                heap.poll();
            }

            ans.add(heap.peek().value);
        }

        return ans;
    }
    class Pair {
        int value;
        int index;

        public Pair(int value, int index)
        {
            this.value = value;
            this.index = index;
        }
    }
}
