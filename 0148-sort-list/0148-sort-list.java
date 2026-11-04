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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;

        ListNode firsthalf=sortList(head);
        ListNode secondhalf=sortList(slow);
        return merge(firsthalf,secondhalf);
        
    }

    public ListNode merge(ListNode first,ListNode second){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(first!=null && second!=null){
            if(first.val<second.val){
                curr.next=first;
                first=first.next;
                curr=curr.next;
            }else{
                curr.next=second;
                second=second.next;
                curr=curr.next;
            }
        }
         if (first != null) {
            curr.next = first;
        } else {
            curr.next = second;
        }
        return dummy.next;

    }
}