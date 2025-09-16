// Last updated: 9/16/2025, 9:33:42 AM
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
        ListNode p =null;
        ListNode c =head;
        ListNode n =null;
        
        while(c!=null ){
            n=c.next;
            c.next=p;
            p=c;

            c=n;
            
        }
        head=p;
        return head;
        

    }
}