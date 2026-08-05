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
    public ListNode middleNode(ListNode head) {
        int mid = length(head)/2;
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            if(count == mid-1){
                head = temp.next;
                temp.next = null;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }
    public int length(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}