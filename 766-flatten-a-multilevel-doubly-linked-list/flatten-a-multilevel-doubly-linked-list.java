/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp != null){
            if(temp.child != null){
                Node child = temp.child;
                Node a = temp.next;
                child = flatten(child);
                temp.next = child;
                child.prev = temp;
                temp.child = null;
                Node d = child;
                while(d.next != null){
                    d = d.next;
                }
                d.next = a;
                if(a != null){
                    a.prev = d;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}