// Last updated: 10/7/2025, 10:51:10 PM
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
    public ListNode reverseList(ListNode head) {
         ListNode prev=null;
         if(head==null) return null;
        ListNode curr=head;

        while(curr.next!=null ){
        ListNode temp=curr.next;
        curr.next=prev;
        // prev=temp;
        prev=curr;
        curr=temp;     
        }
        curr.next=prev;
        return curr;
    }
}