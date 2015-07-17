package LinkedList.SwapNodesInPairs_24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
    	if(head==null || head.next==null)
    		return head;
    	
    	ListNode ret=head.next;
    	ListNode pre=head, pos=head.next,last=null;
    	//missed last previously
    	while(pre!=null && pos!=null){
    		ListNode trd=pos.next;
    		pre.next=trd;
    		pos.next=pre;
    		if(last!=null)
    			last.next=pos;
    		
    		last=pre;
    		pre=trd;
    		pos=(trd==null)?null:trd.next;
    	}
    	return ret;
    }
    
    public static void main(String[] args){
    	ListNode head=new ListNode(1);
    	ListNode head2=new ListNode(2);
    	ListNode head3=new ListNode(3);
    	ListNode head4=new ListNode(4);
    	head.next=head2;
    	head2.next=head3;
    	head3.next=head4;
    	
    	Solution s=new Solution();
    	s.swapPairs(head);
    }
}