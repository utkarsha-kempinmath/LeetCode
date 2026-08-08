class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 1;
        ListNode cut = null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevGrp = dummy;
        ListNode start = head;
        while(start != null){
            ListNode temp = start;
            for(int i=0; i<k; i++){
                if(temp == null){
                    return dummy.next;
                }
                temp = temp.next;
            }
            ListNode nxtGrp = temp;
            ListNode end = start;
            for(int i=1; i<k; i++){
                end = end.next;
            }
            end.next = null;
            ListNode reversed = rev(start);
            prevGrp.next = reversed;
            start.next = nxtGrp;
            prevGrp = start;
            start = nxtGrp;
        }
        return dummy.next;
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