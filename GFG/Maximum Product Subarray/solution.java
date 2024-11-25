class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
  
        // leftToRight to store product from left to Right
        int leftToRight = 1;
  
        // rightToLeft to store product from right to left
        int rightToLeft = 1;
  
        for (int i = 0; i < n; i++) {
            if (leftToRight == 0)
                leftToRight = 1;
            if (rightToLeft == 0)
                rightToLeft = 1;
      
            // calculate product from index left to right
            leftToRight *= arr[i];
      
            // calculate product from index right to left
            int j = n - i - 1;
            rightToLeft *= arr[j];
            maxProd = Math.max(leftToRight, 
                               Math.max(rightToLeft, maxProd));
        }
        return maxProd;
    }
}
