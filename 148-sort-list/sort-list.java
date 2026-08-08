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
        return mergeSort(head);
    }

    ListNode mergeSort(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        head = mergeSort(head);
        a = mergeSort(a);
        return merge(head, a);
    }
    ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(a != null && b != null){
            if(a.val >= b.val){
                curr.next = b;
                b = b.next;
            }
            else {
                curr.next = a;
                a = a.next;
            }
            curr = curr.next;
        }
        curr.next = (a != null) ? a : b;
        return dummy.next;
    }
}