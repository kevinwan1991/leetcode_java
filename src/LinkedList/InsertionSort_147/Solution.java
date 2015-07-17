package LinkedList.InsertionSort_147;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
        	return head;
        
        ListNode fakeHead=new ListNode(0);
        ListNode cur,pre,next;
        cur=head;
        
        while(cur!=null){
        	next=cur.next;
        	pre=fakeHead;
        	
        	while(pre.next!=null && pre.next.val<cur.val)//Interesting!!!
        		pre=pre.next;
        	cur.next=pre.next;
        	pre.next=cur;
        	
        	cur=next;
        }
        return fakeHead.next;
    }
}