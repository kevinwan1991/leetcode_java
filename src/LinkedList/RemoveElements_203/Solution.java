package LinkedList.RemoveElements_203;

public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if(head==null)
			return null;
		
		ListNode pre=null;
		ListNode cur=head;
		ListNode frt=head;
		while(cur!=null){
			if(cur.val==val){
				if(pre!=null){
					pre.next=cur.next;
				}else{
					frt=cur.next;
				}
				cur=cur.next;
			}else{
				pre=cur;
				cur=cur.next;
			}
		}
	    return frt;
	}
}
