class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i: arr){
            if(!set.contains(i)){
                set.add(i);
                ans.add(i);
            }
        }
        return ans;
    }
}
