// Last updated: 10/7/2025, 11:28:12 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Queue <ListNode>st=new LinkedList<>();
         if(head==null) return false;
         ListNode prev=null;
        ListNode curr=head;
        st.add(curr);
        while(curr.next!=null ){
        ListNode temp=curr.next;
        st.add(temp);
        curr.next=prev;
        // prev=temp;
        prev=curr;
        curr=temp;     
        }//1 2 2 1 
        curr.next=prev;
        
        while(curr!=null){
            if(st.peek().val!=curr.val){
                System.out.println(curr.val);
                System.out.println(st.peek().val);
                return false;
            }
            st.remove();
            curr=curr.next;
        }
        return true;}
}