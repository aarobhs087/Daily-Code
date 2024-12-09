# Medium

Geek has an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith event and intervals is sorted in ascending order by starti. He wants to add a new interval newInterval= [newStart, newEnd] where newStart and newEnd represent the start and end of this interval.

Help Geek to insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Examples:

Input: intervals = [[1,3], [4,5], [6,7], [8,10]], newInterval = [5,6]

Output: [[1,3], [4,7], [8,10]]

Explanation: The newInterval [5,6] overlaps with [4,5] and [6,7].

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,9]

Output: [[1,2], [3,10], [12,16]]

Explanation: The new interval [4,9] overlaps with [3,5],[6,7],[8,10].


Constraints:

1 ≤ intervals.size() ≤  10^5

0 ≤ start[i], end[i] ≤ 10^9
