// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i: arr)    if(i>=0)    p.add(i);     else     n.add(i);
        int j=0,k=0;
        for(int i=0;i<arr.size();){
             if(i<arr.size() && k<p.size()){
                 arr.set(i,p.get(k));
                 i++;
                 k++;
             }
            if(i<arr.size() && j<n.size()){
                arr.set(i,n.get(j));
                i++;
                j++;
            }
        }
        
    }
}
