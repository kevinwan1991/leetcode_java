package LinkedList.AddTwoNumbers_2;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carr=0;
        
        ListNode resHead=new ListNode(0);
        ListNode pt1,pt2,pt;
        pt1=l1;
        pt2=l2;
        pt=resHead;
        
        while(pt1!=null || pt2!=null){
        	if(pt1!=null){
        		carr+=pt1.val;
        		pt1=pt1.next;
        	}
        	if(pt2!=null){
        		carr+=pt2.val;
        		pt2=pt2.next;
        	}
        	pt.next=new ListNode(carr%10);
        	pt=pt.next;
        	carr/=10;
        }
        if(carr==1)
        	pt.next=new ListNode(1);
        
        return resHead.next;
    }
}