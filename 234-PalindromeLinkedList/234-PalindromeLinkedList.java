// Last updated: 9/16/2025, 9:33:31 AM
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

        // ListNode p=null;
        // ListNode curr=head;
        // ListNode n=null;
        // while(curr!=null){
        //     n=curr.next;
        //     curr.next=p;
        //     p=curr;
        //     curr=n;
        // }
        // head=p;
        // if(p==head){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        // find mid;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode shalf = reverseList(slow);
        ListNode fhalf = head;

        while(shalf!=null){
            if(fhalf.val != shalf.val){
                return false;
            }
            fhalf=fhalf.next;
            shalf=shalf.next;
        }
        return true;
        
    }
    public static ListNode reverseList(ListNode head){
        ListNode p=null,curr=head,n=null;
        while(curr!=null){
            n=curr.next;
            curr.next=p;
            p=curr;
            curr=n;
        }
        return p;
    }
}