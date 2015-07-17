package LinkedList.RemoveNthFromEnd_19;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode fast,slow,prev;
    	fast=head;
    	slow=head;
    	prev=null;
    	
    	for(int i=0; i<n; i++)
    		fast=fast.next;
    	
    	while(fast!=null && slow!=null){
    		prev=slow;
    		fast=fast.next;
    		slow=slow.next;
    	}
    	
    	if(prev==null)
    		head=head.next;
    	else
    		prev.next=slow.next;
    	
    	return head;
    }
}