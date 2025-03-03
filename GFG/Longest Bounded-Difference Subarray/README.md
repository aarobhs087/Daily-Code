# Medium

Given an array of positive integers arr[] and a non-negative integer x, the task is to find the longest sub-array where the absolute difference between any two elements is not greater than x.

If multiple such subarrays exist, return the one that starts at the smallest index.

Examples: 

Input: arr[] = [8, 4, 2, 6, 7], x = 4 

Output: [4, 2, 6] 

Explanation: The sub-array described by index [1..3], i.e. [4, 2, 6] contains no such difference of two elements which is greater than 4.

Input: arr[] = [15, 10, 1, 2, 4, 7, 2], x = 5 

Output: [2, 4, 7, 2] 

Explanation: The sub-array described by indexes [3..6], i.e. [2, 4, 7, 2] contains no such difference of two elements which is greater than 5. 

Constraints:

1 <= arr.size() <= 10^5

1 <= arr[i] <= 10^9

0 <= x<= 10^9

