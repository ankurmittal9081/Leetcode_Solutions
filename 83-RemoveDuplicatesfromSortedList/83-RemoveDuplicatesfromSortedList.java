// Last updated: 10/7/2025, 10:17:53 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        if(head==null) return null;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
                // head=head.next;
            }
            else{
                head=head.next;
            }
        }
        head=curr;
        return head;
    }
}