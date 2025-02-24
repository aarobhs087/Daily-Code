class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
         int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int res = 0, tp, curr;
        
        for (int i = 0; i < n; i++) {  
          
            // Process the stack while the current element 
            // is smaller than the element corresponding to 
            // the top of the stack
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
              
                // The popped item is to be considered as the 
                // smallest element of the Histogram
                tp = s.pop();
                
                // For the popped item, previous smaller element
                // is just below it in the stack (or current stack 
                // top) and next smaller element is i
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                
                // Update the result if needed
                res = Math.max(res, arr[tp] * width);
            }
            s.push(i);
        }

        // For the remaining items in the stack, next smaller does
        // not exist. Previous smaller is the item just below in
        // the stack.
        while (!s.isEmpty()) {
            tp = s.pop();
            curr = arr[tp] * (s.isEmpty() ? n : n - s.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;
    }
}
