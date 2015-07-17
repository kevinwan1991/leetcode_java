package Sort.SortList_148;

public class Solution {
    public ListNode sortList(ListNode head) {
    	if(head==null || head.next==null)
    		return head;
    	
    	//-------SPLIT THE LIST--------//
    	ListNode runner=head;
    	ListNode walker=head;
    	ListNode helper=null;
    	while(runner!=null){
    		runner=runner.next;
    		if(runner!=null)
    			runner=runner.next;
    		helper=walker;
    		walker=walker.next;
    	}
    	helper.next=null;
    	
    	ListNode first=head;
    	ListNode second=walker;
    	
    	first=sortList(first);
    	second=sortList(second);
    	return merge(first,second);
    }
    
    public ListNode merge(ListNode first,ListNode second){
    	ListNode result=new ListNode(0);
    	ListNode tmp=result;
    	while(first!=null && second!=null){
    		if(first.val<second.val){
    			tmp.next=first;
    			first=first.next;
    		}else{
    			tmp.next=second;
    			second=second.next;
    		}
    		tmp=tmp.next;
    	}
    	
    	if(first!=null)
    		tmp.next=first;
    	else
    		tmp.next=second;
    	
    	return result.next;
    }
}