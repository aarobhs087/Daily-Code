// User function Template for Java
class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        while(head!=null){
            head=head.next;
            if(head==null)  return false;
            head=head.next;
        }
        return true;
    }
}
