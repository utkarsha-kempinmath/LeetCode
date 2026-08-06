/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA);
        int lenB = len(headB);
        ListNode temp = new ListNode();
        ListNode temp1 = new ListNode();
        int maxLen = Math.max(lenA, lenB);
        if(lenA>lenB){ 
            temp = headA;
            temp1 = headB;
        }
        else{
            temp = headB;
            temp1 = headA;
        }
        ListNode[] hash = new ListNode[maxLen];
        for(int i=0; i<hash.length; i++){
            hash[i] = temp;
            temp = temp.next;
        }
        while(temp1 != null){
            for(int j=0; j<hash.length; j++){
                if(hash[j] == temp1){
                    return temp1;
                } 
            }
            temp1 = temp1.next;
        }
        return null;
    }
    int len(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}