/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null){return null;}
        
        ListNode before_dummy = new ListNode(0);
        ListNode after_dummy = new ListNode(0);
        
        ListNode before = before_dummy;
        ListNode after = after_dummy;
        
        while(head != null)
        {
            if(head.val < x)
            {
                before.next = head;
                before = before.next;
            }
            else
            {
                after.next = head;
                after = after.next;
            }
            
            head = head.next;
        }
        
        after.next = null;
        before.next = after_dummy.next;
        
        return before_dummy.next;
    }
}
