package LinkedList.ReversedLinkedListII_92;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode sndHead=null,sndTail=null;
    	ListNode fstTail=null,trdHead=null;
    	ListNode tmp=head,preTmp=null;
    	ListNode pre,cur;

    	if(m==n)
    		return head;
    	
    	int count=1;
    	while(tmp!=null){
    		if(count==m-1)
    			fstTail=tmp;
    		if(count==m)
    			sndHead=tmp;
    		if(count==n)
    			sndTail=tmp;
    		if(count==n+1)
    			trdHead=tmp;
    		if(count<=n && count>m){
    			pre=preTmp;
    	    	cur=tmp;
    	    	
    	    	preTmp=cur;
    	    	tmp=cur.next;
    	    	count++;
    	    	
    	    	cur.next=pre;
    	    	continue;
    		}
    		count++;
    		preTmp=tmp;
    		tmp=tmp.next;
    	}
    	   	
    	sndHead.next=trdHead;
    	if(fstTail==null)
    		head=sndTail;
    	else
    		fstTail.next=sndTail;
    	
    	return head;
    }
}