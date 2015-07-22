package LinkedList.AddTwoNumbers_2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        
        ListNode pt1=l1;
        ListNode pt2=l2;
        ListNode pre1=l1;
        int addOn=0;
        while(pt1!=null && pt2!=null){
        	pt1.val=pt1.val+pt2.val+addOn;
        	addOn=0;
        	if(pt1.val>9){
        		addOn=1;
        		pt1.val-=10;
        	}
        	pre1=pt1;
        	pt1=pt1.next;
        	pt2=pt2.next;
        }
        
        if(pt1==null && pt2==null){
        	if(addOn==1)
        		pre1.next=new ListNode(addOn);
        }else{
        	ListNode pt=null;
        	ListNode pre=null;
            if(pt1==null && pt2!=null){
            	pre1.next=pt2;
            	pt=pt2;
            	pre=pt2;
            }else{
            	pt=pt1;
            	pre=pt1;
            }
            while(pt!=null){
            	pt.val+=addOn;
            	addOn=0;
            	if(pt.val>9){
            		addOn=1;
            		pt.val-=10;
            	}
            	pre=pt;
            	pt=pt.next;
            }
            if(addOn==1){
            	pre.next=new ListNode(1);
            }
        }
        return l1;
    }
}