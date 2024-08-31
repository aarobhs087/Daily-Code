class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int i=0,j=0;
        int n1=arr1.size(), n2=arr2.size();
        int sum1=0, sum2=0;
        int ans=0;
        while(i<n1&&j<n2){
            if(arr1.get(i)<arr2.get(j)){
                sum1+=arr1.get(i++);
            }
            else if(arr1.get(i)>arr2.get(j)){
                sum2+=arr2.get(j++);
            } 
            else{
                ans+=Math.max(sum1,sum2)+arr1.get(i);
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<n1){
            sum1+=arr1.get(i);
            i++;
        }
        while(j<n2){
            sum2+=arr2.get(j);
            j++;
        }
        ans+=Math.max(sum1,sum2);
        return ans;
    }
}
