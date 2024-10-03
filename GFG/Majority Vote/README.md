# Medium

You are given an array of integer nums[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return -1. 

Examples:

Input: nums = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]

Output: [5, 6]

Explanation: 5 and 6 occur more n/3 times.

Input: nums = [1, 2, 3, 4, 5]

Output: [-1]

Explanation: no candidate occur more than n/3 times.


Expected Time Complexity: O(n)

Expected Space Complexity: O(1)


Constraint:

1 <=  nums.size()  <= 10^6

-109 <= nums[i] <= 10^9
