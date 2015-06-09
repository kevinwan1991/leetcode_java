package LinkedList.ReverseLinkedList_206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)
        	return head;
        
        ListNode pre=head;
        ListNode pos=pre.next;
        pre.next=null;
        while(pos!=null){
        	ListNode tmp=pos.next;
        	pos.next=pre;
        	
        	pre=pos;
        	pos=tmp;
        }
        return pre;
    }
}