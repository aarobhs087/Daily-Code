class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            max=Math.max(max,arr[i]+arr[i-1]);
        }
        return max;
    }
}
