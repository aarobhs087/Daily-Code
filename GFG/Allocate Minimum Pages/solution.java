//Back-end complete function Template for Java

class Solution {
    static boolean check(int[] arr, int k, int pageLimit) {
        
        // Starting from the first student
        int cnt = 1;
        int pageSum = 0;
        for(int i = 0; i < arr.length; i++) {
            
            // If adding the current book exceeds the page 
            // limit, assign the book to the next student
            if(pageSum + arr[i] > pageLimit) {
                cnt++;
                pageSum = arr[i];
            }
            else {
                pageSum += arr[i];
            }
        }
        
        // If books can assigned to less than k students then
        // it can be assigned to exactly k students as well
        return (cnt <= k);
    }
    public static int findPages(int[] arr, int k) {
        // code here
        // If number of students are more than total books
        // then allocation is not possible
        if(k > arr.length)
            return -1;
        
        // Search space for Binary Search
        int lo = Arrays.stream(arr).max().getAsInt();
        int hi = Arrays.stream(arr).sum();
        int res = -1;
        
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if(check(arr, k, mid)){
                res = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        
        return res;
    }
}
