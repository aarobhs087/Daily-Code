# Medium

Given a Circular Linked List. The task is to delete the given node, key in the circular linked list, and reverse the circular linked list.

Note: You don't have to print anything, just return head of the modified list in each function.

Examples:

Input: Linked List: 2->5->7->8->10, key = 8

Output: 10->7->5->2 

Explanation:
After deleting 8 from the given circular linked list, it has elements as 2, 5, 7, 10. Now, reversing this list will result in 10, 7, 5, 2.

Input: Linked List: 1->7->8->10, key = 8

Output: 10->7->1

Explanation: 
After deleting 8 from the given circular linked list, it has elements as 1, 7,10. Now, reversing this list will result in 10, 7, 1.


Expected Time Complexity: O(n)

Expected Auxillary Space: O(1)


Constraints:

2 <= number of nodes, key  <= 10^5

1 <= node -> data <= 10^5
