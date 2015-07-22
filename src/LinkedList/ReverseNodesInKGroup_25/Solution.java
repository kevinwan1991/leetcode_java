package LinkedList.ReverseNodesInKGroup_25;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) // K may be weird value
        	return head;
        
        ListNode fakeHead=new ListNode(0);
        fakeHead.next=head;
        
        ListNode cur, pre;
        cur=head;
        pre=fakeHead;
        
        int count=0;
        while(cur!=null){
        	count++;
        	if(count%k==0){
        		pre=reverse(pre,cur.next);
        		cur=pre.next;
        	}else
        		cur=cur.next;
        }
        return fakeHead.next;
    }
    
    // this way of reversing give back the last node:
    // while change direction way of reversing give back the head node!
    public ListNode reverse(ListNode pre, ListNode next){
    	ListNode last=pre.next;
    	ListNode cur=last.next;
    	while(cur!=next){
    		last.next=cur.next;
    		cur.next=pre.next;
    		pre.next=cur;
    		cur=last.next;
    	}
    	//Give back the last one!
    	return last;
    }
    
    public static void main(String[] args){
    	ListNode node1=new ListNode(1);
    	ListNode node2=new ListNode(2);
    	ListNode node3=new ListNode(3);
    	ListNode node4=new ListNode(4);
    	ListNode node5=new ListNode(5);
    	ListNode node6=new ListNode(6);
    	node1.next=node2;
    	node2.next=node3;
    	node3.next=node4;
    	node4.next=node5;
    	node5.next=node6;
    	
    	Solution s=new Solution();
    	s.reverseKGroup(node1, 3);
    }
}