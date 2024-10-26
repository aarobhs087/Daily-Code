class Solution {
    public boolean findTriplet(int[] arr) {
        Set<Integer> s=new HashSet<>();
        for(int i: arr) s.add(i);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int x=arr[i]+arr[j];
                if(s.contains(x))   return true;
            }
        }
        return false;
    }
}
