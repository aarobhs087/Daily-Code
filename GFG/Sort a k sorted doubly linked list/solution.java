// User function Template for Java
class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        if (head == null) return null;

        // Create a Min Heap (PriorityQueue) to sort the first k+1 elements
        PriorityQueue<DLLNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

        DLLNode newHead = null, last = null;
        
        // Add first k+1 elements to the heap
        DLLNode curr = head;
        for (int i = 0; curr != null && i <= k; i++) {
            minHeap.add(curr);
            curr = curr.next;
        }

        // Process the rest of the list
        while (!minHeap.isEmpty()) {
            // Get the minimum element from heap
            DLLNode minNode = minHeap.poll();

            // This is the new head if it's the first element we're processing
            if (newHead == null) {
                newHead = minNode;
                newHead.prev = null;
                last = newHead;
            } else {
                // Link the current last node with minNode
                last.next = minNode;
                minNode.prev = last;
                last = minNode;
            }

            // Add the next element from the list to the heap
            if (curr != null) {
                minHeap.add(curr);
                curr = curr.next;
            }
        }

        // The last node of the sorted list should have next as null
        if (last != null) {
            last.next = null;
        }

        return newHead;
    }
}
