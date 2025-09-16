// Last updated: 9/16/2025, 9:34:47 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null) return list2;
        if(list2==null) return list1;

        // ListNode curr=new ListNode();
        // ListNode tail=curr;

        // while(list1 !=null && list2 !=null){
        //         tail.next=list1;
        //         list1=list1.next;
        //     }
        //     else{
        //         tail.next=list2;
        //         list2=list2.next;
        //     }
        //     tail=tail.next;
        // }
        // tail.next=(list1 != null )? list1:list2;
        // return curr.next;

        if(list1.val<=list2.val){

            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }
        
        else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}