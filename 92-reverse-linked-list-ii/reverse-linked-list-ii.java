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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        int count = 1;
        ListNode toBeRev = null;
        ListNode before = null;
        ListNode after = null;
        ListNode temp = head;
        while(temp != null){
            if(count == left-1){
                before = temp;
            }
            if(count == left){
                toBeRev = temp;
            }
            if(count == right){
                after = temp.next;
                temp.next = null;
            }
            temp = temp.next;
            count++;
        }
        if(before != null){
            before.next = rev(toBeRev);
        } 
        else{
            head = rev(toBeRev);
        }
        ListNode tail = toBeRev;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = after;
        return head;
    }

    ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}