package LinkedList.MergeTwoSortedList_21;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        
        ListNode header=new ListNode(0);
        ListNode tmp1=l1, tmp2=l2, tmp=header;
        while(tmp1!=null && tmp2!=null){
        	if(tmp1.val<=tmp2.val){
        		tmp.next=tmp1;
        		tmp1=tmp1.next;
        	}else{
        		tmp.next=tmp2;
        		tmp2=tmp2.next;	
        	}
        	tmp=tmp.next;
        }
        
        if(tmp1!=null)
        	tmp.next=tmp1;
        if(tmp2!=null)
        	tmp.next=tmp2;
        
        return header.next;
    }
}