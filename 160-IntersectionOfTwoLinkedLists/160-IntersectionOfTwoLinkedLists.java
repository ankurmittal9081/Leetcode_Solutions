// Last updated: 9/16/2025, 9:33:49 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA;
        ListNode ptr2=headB;

        if (ptr1 == null || ptr2 == null)
            return null;

        while(ptr1 !=ptr2){
             ptr1 = (ptr1 != null) ? ptr1.next : headB;
            ptr2 = (ptr2 != null) ? ptr2.next : headA;

        }
        return ptr1;
        
    }
}