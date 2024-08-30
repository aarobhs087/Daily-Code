# Medium

You are given an array arr, you need to find any three elements in it such that arr[i] < arr[j] < arr[k] and i < j < k.

Note:

The output will be 1 if the subsequence returned by the function is present in the array arr

If the subsequence is not present in the array then return an empty array, the driver code will print 0.

If the subsequence returned by the function is not in the format as mentioned then the output will be -1.

Examples :

Input: arr = [1, 2, 1, 1, 3]

Output: 1

Explanation: A subsequence 1 2 3 exist.

Input: arr = [1, 1, 3]

Output: 0

Explanation: No such Subsequence exist, so empty array is returned (the driver code automatically prints 0 in this case).


Expected Time Complexity: O(n)

Expected Auxiliary Space: O(n)

Constraints:

1 <= arr.size() <= 10^5

1 <= arr[i] <= 10^6

