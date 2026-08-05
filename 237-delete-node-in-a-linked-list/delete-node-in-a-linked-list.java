/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void deleteNode(ListNode target) {
        ListNode temp = target;
        temp.val = temp.next.val;
        temp.next = temp.next.next;
    }
}