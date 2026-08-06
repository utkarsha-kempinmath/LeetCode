/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = slow(head);
        if (p2 == null)
            return null;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    ListNode slow(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
}