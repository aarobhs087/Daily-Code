// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        int count=0;
        Node curr=head;
       Set<Node> s=new HashSet<>();
        while(curr!=null){
            count++;
            if(s.contains(curr)){
                return count-find(head,curr);
            }
            else    s.add(curr);
            curr=curr.next;
            
           
        }
        return 0;
    }
    public int find(Node head,Node curr){
        int count=0;
        Node t=head;
        if(t==curr) return 1;
        while(t!=null){
            t=t.next;
            count++;
            if(t==curr) break;
        }
        return count+1;
    }
}
