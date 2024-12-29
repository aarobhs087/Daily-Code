class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
         // Put all elements of a[] in sa
        HashSet<Integer> sa = new HashSet<>();
        for (int num : a) {
            sa.add(num);
        }

        ArrayList<Integer> res = new ArrayList<>();

        // Traverse through b[]
        for (int num : b) {
          
            // If the element is in sa
            if (sa.contains(num)) {
                res.add(num);          // Add it to the result array
                sa.remove(num);        // Erase it from sa to avoid duplicates
            }
        }

        return res;
    }
}
