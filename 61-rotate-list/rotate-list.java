
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int rotations = rot(head, k);
        if(rotations == 0) return head; 
        int cut = len(head) - rotations;
        ListNode toCut = head;
        ListNode newHead = null;
        int count = 1;
        while(count < cut){
            toCut = toCut.next;
            count++;
        }
        newHead = toCut.next;
        toCut.next = null;
        ListNode temp = newHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
    int rot(ListNode head, int k){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return k%len;
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
}