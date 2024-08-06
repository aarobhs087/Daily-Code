class Solution {
    public int minimumPushes(String word) {
        int arr[] = new int[26];
        for (char c : word.toCharArray())    arr[c - 'a']++;
        Arrays.sort(arr);
        int count = 0, c = 0, cost = 1;
        for (int i = 25; i >= 0 && arr[i] > 0; i--) {
            c++;
            if (c > 8) {
                c = 1;
                cost++;
            }
            count += arr[i] * cost;
        }
        return count;
    }
}
