// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        List<Integer> l=new ArrayList<>();
        d=d%arr.length;
        for(int i=0;i<d;i++){
            l.add(arr[i]);
        }
        int j=0;
        for(int i=d;i<arr.length;i++){
            arr[j++]=arr[i];
        }
        for(int i: l){
            arr[j++]=i;
        }
    }
}
