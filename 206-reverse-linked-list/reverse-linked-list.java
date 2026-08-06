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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int len = len(head);
        int count = 1;
        int mid = len/2;
        while(count<=mid){
            int target = len-count+1;
            ListNode x = getTarget(head, target);
            ListNode y = getTarget(head, count);
            int t = y.val;
            y.val = x.val;
            x.val = t;
            count++;
        }
        return head;
    }
    int len(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    ListNode getTarget(ListNode head, int target){
        int count = 1;
        ListNode temp = head;
        while(temp != null){
            if(count == target) 
                return temp;
            count++;
            temp = temp.next;
        }
        return null;
    }
}