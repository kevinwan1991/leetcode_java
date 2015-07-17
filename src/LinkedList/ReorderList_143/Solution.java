package LinkedList.ReorderList_143;

public class Solution {
    public void reorderList(ListNode head) {
        if(head==null)
        	return;
        
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null && slow!=null){
        	fast=fast.next.next;
        	slow=slow.next;
        }
        
        ListNode snd=slow.next;
        slow.next=null;//I missed it!
        snd=reverseList(snd);
        ListNode fst=head;
        while(fst!=null && snd!=null){//watch out for null!
        	ListNode fstTmp=fst.next;
        	ListNode sndTmp=snd.next;
        	fst.next=snd;
        	snd.next=fstTmp;
        	
        	fst=fstTmp;
        	snd=sndTmp;
        }
    }
    
    public ListNode reverseList(ListNode head){
    	if(head==null || head.next==null)//watch out for null!
    		return head;//not return null!!!
    	ListNode pre=head;
    	ListNode pos=head.next;
    	while(pos!=null){
    		ListNode tmp=pos.next;
    		pos.next=pre;
    		
    		pre=pos;
    		pos=tmp;
    	}
    	head.next=null;//I missed it!
    	return pre;
    }
}