package LinkedList.PartitionList_86;

public class Solution {
    public ListNode partition(ListNode head, int x) {
    	if(head==null || head.next==null)
    		return head;
    	
    	ListNode lessHead=new ListNode(0);
        ListNode moreHead=new ListNode(0);
        ListNode tmp=head,tmpLess=lessHead,tmpMore=moreHead;
        
        //Memory limit, just extract second chain:
        while(tmp!=null){
        	if(tmp.val<x){
        		tmpLess.next=tmp;
        		tmpLess=tmpLess.next;
        	}
        	else{
        		tmpMore.next=tmp;
        		tmpMore=tmpMore.next;
        	}
        	tmp=tmp.next;
        }
        tmpMore.next=null;//the part that cause memory out of bounds!
        
        /*if(tmpLess==lessHead)
        	return moreHead.next;*/
        tmpLess.next=moreHead.next;
        head=lessHead.next;
        return head;
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	ListNode head=new ListNode(1);
    	s.partition(head, 2);
    }
}