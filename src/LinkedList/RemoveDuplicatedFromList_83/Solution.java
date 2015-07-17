package LinkedList.RemoveDuplicatedFromList_83;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        	return head;
        
    	ListNode pre,pos;
        pre=head;
        pos=head.next;
        while(pre!=null && pos!=null){
        	ListNode tmp=pos.next;
        	if(pre.val==pos.val){
        		pre.next=pos.next;
        		pos.next=null;
        		
        		pos=tmp;
        	}else{
        		pre=pos;
            	pos=tmp;
        	}
        }
        return head;
    }
}