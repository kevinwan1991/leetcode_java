package LinkedList.IntersectionOfTwoLinkedList_160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if(headA==null || headB==null)
    		return null;
        ListNode aNode, bNode;
        aNode=headA;
        bNode=headB;
        
        while(true){
        	if(aNode==null && bNode==null)
        		return null;
        	if(aNode==null)
        		aNode=headB;
        	if(bNode==null)
        		bNode=headA;
        	
        	if(aNode==bNode)
        		return aNode;
        	aNode=aNode.next;
        	bNode=bNode.next;
        }
    }
}