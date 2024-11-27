class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int size=arr.length;
        Arrays.sort(arr);
        int x=1;
        for(int i=0;i<size;i++) {
            if(arr[i]<=0) continue;
            else if(arr[i]!=x){
                return x;
            }
            else if(i<size-1&&arr[i]==arr[i+1]){
                continue;
            }
            x++;
        }
        return x;
    }
}
