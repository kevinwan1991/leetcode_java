package LinkedList.DeleteNodeInALinkedList_237;

public class Solution {
    public void deleteNode(ListNode node) {
        int nextValue=node.next.val;
        node.val=nextValue;
        node.next=node.next.next;
    }
}