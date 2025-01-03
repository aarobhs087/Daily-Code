# Medium

Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.

Examples: 

Input: arr[] = [4, 2, 2, 6, 4], k = 6

Output: 4

Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.

Input: arr[] = [5, 6, 7, 8, 9], k = 5

Output: 2

Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]. Hence, the answer is 2.


Constraints:

1 ≤ arr.size() ≤ 10^5

0 ≤ arr[i] ≤10^5

0 ≤ k ≤ 10^5
