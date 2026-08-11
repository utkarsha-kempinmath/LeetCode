class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> tempSt = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        while(st.size() != 0){
            if(tempSt.size() == 0) tempSt.push(st.pop());
            if(st.peek() >= tempSt.peek()){
                tempSt.push(st.pop());
            }
            else{
                st.pop();
            }
        }
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        while(tempSt.size() != 0){
            curr.next = new ListNode(tempSt.pop());
            curr = curr.next;
        }
        return ans.next;
    }
}