package LinkedList.RotateList_61;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	// For corner cases:
    	if(k==0 || head==null)
    		return head;
    	
        ListNode fast=head;
        ListNode slow=head;
        ListNode snd;

        //re-calculate k:
        int len=0;
        while(fast!=null){
        	len++;
        	fast=fast.next;
        }
        fast=head;
        k=k%len;//watch out for divided by 0;
        if(k==0)
        	return head;
        
        //main:
        for(int i=0; i<k; i++)
        	fast=fast.next;
        
        while(fast.next!=null){
        	fast=fast.next;
        	slow=slow.next;
        }
        
        snd=slow.next;
        slow.next=null;
        fast.next=head;
        return snd;
    }
}