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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;
        int ind = 0;
        int f = -1;
        int l = -1;
        int min = Integer.MAX_VALUE;
        while(c != null){
            if(b.val > a.val && b.val > c.val ||
            (b.val < a.val && b.val < c.val)){
                if(f == -1) f = ind;
                if(l != -1){
                    min = Math.min(min, ind-l);
                }
                l = ind;
            }
            ind++;
            a = b;
            b = c;
            c = c.next;
        }
        if(f != -1 && l != f){
            ans[0] = min;
            ans[1] = l - f;
        }
        return ans;
    }
}