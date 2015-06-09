package LinkedList.ReverseLinkedList_206;

public class Solution_recursive {
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)
        	return head;
        
        ListNode pre=head;
        ListNode pos=pre.next;
        pre.next=null;
        
        return helper(pre,pos);
    }
	
	public ListNode helper(ListNode pre, ListNode pos){
		if(pos==null)
			return pre;
		
		ListNode tmp=pos.next;
		pos.next=pre;
		
		return helper(pos,tmp);
	}
}
