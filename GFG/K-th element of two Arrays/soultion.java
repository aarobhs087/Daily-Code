class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        List<Integer> l=new ArrayList<>();
        int i=0,j=0,n1=arr1.length,n2=arr2.length;
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                l.add(arr1[i]);
                i++;
            }
            else {
                l.add(arr2[j]);
                j++;
            }
           
        }
        while(i<n1){
            l.add(arr1[i++]);
        }
        while(j<n2){
            l.add(arr2[j++]);
        }
        return l.get(k-1);
    }
}
