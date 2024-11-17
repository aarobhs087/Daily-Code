
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i=0,j=arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}
