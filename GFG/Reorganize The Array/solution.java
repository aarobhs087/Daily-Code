import java.util.Collections;
class Solution {
    public boolean search(List<Integer> arr, int key, int i, int j) {
        if (i > j) return false; // Fix condition for search termination
        int mid = (i + j) / 2;
        if (arr.get(mid) == key) return true;
        if (arr.get(mid) > key) {
            return search(arr, key, i, mid - 1);
        } else {
            return search(arr, key, mid + 1, j);
        }
    }

    public List<Integer> rearrange(List<Integer> arr) {
        // Sort the array
        Collections.sort(arr);
        List<Integer> l = new ArrayList<>();
        int n = arr.size();
        
        for (int i = 0; i < n; i++) {
            if (search(arr, i, 0, n - 1)) {
                l.add(i);
            } else {
                l.add(-1);
            }
        }
        return l;
    }
}
