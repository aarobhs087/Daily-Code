// User function Template for Java
class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        int pref[]=new int[n];
        int suff[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(i==0){
                pref[i]=arr[i];
            }
            else{
                pref[i]=pref[i-1]+arr[i];
            }
        }
        suff[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+arr[i];
        }
        int i=0,j=n-1;
        while(i<j){
            if(pref[i]==suff[j]){
                int x=sum-pref[i]-suff[j];
                if(x==pref[i]){
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
                i++;
            }
            else if(pref[i]<suff[j]){
                i++;
            }
            else{
                j--;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}
