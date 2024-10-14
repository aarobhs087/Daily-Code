# Medium

Given an unsorted array of integers arr[], and a target tar, determine the number of subarrays whose elements sum up to the target value.

Examples:

Input: arr[] = [10, 2, -2, -20, 10] , tar = -10

Output: 3

Explanation: Subarrays with sum -10 are: [10, 2, -2, -20], [2, -2, -20, 10] and [-20, 10].

Input: arr[] = [1, 4, 20, 3, 10, 5] , tar = 33

Output: 1

Explanation: Subarray with sum 33 is: [20,3,10].


Expected Time Complexity: O(n)

Expected Auxilary Space: O(n)

Constraints:

1 <= arr.size() <= 10^6

-10^5 <= arr[i] <= 10^5

-10^5 <= tar <= 10^5
