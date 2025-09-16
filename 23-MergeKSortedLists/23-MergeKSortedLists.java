// Last updated: 9/16/2025, 9:34:46 AM
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        
        for(ListNode node:lists){
            if (node != null) pq.add(node);
        }

        ListNode head=null;
        ListNode tail=null;

        while(pq.size()>0)
        {
            ListNode node = pq.poll();

            if(head==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }

            if (node.next != null) {
                pq.add(node.next);
            }
        }
        return head;
    }
}