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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = len(head);
        int target = length - n;
        if(length == 1) return null;
        if(target == 0)
            return head.next;

        ListNode temp = head;
        int count = 0;
        while(temp != null){
            if(count == target - 1){
                temp.next = temp.next.next;
                break;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }

    int len(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}