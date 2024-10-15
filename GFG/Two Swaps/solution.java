
class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int N=arr.size();
        int A[]=new int[N];
        int x=0;
        for(int i:arr){
            A[x++]=i;
        }
       int count = findUnsortedCount(A);
 
        if (count == 0 || count == 3) {
            return true;
        }
 
        if (count == 4) {
 
            // Swap twice and check whether
            // the array is sorted.
            swapOne(A);
            swapOne(A);
            return findUnsortedCount(A) == 0;
        }
 
        return false;
    }
 
    static int findUnsortedCount(int[] array)
    {
 
        // Count the number of elements which
        // are not at their correct position
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                count++;
            }
        }
        return count;
    }
 
    static void swapOne(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                int temp = array[i];
                array[i] = array[temp - 1];
                array[temp - 1] = temp;
                break;
            }
        }
    }
}
