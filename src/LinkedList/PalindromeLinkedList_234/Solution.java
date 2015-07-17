package LinkedList.PalindromeLinkedList_234;

public class Solution {
    public boolean isPalindrome(ListNode head) {
    	if(head==null || head.next==null)
    		return true;
    	
    	ListNode fast=head;
    	ListNode slow=head;
    	while(fast.next!=null && fast.next.next!=null){
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	ListNode head2=slow.next;
    	slow.next=null;
    	
    	head2=reverseList(head2);
    	
    	while(head!=null && head2!=null){
    		if(head.val!=head2.val)
    			return false;
    		head=head.next;
    		head2=head2.next;
    	}
    	return true;
    }
    
    public ListNode reverseList(ListNode head){
    	if(head==null || head.next==null)
    		return head;
    	
    	ListNode pre=head;
    	ListNode cur=head.next;
    	while(cur!=null && pre!=null){
    		ListNode tmp=cur.next;
    		cur.next=pre;
    		
    		pre=cur;
    		cur=tmp;
    	}
    	head.next=null;
    	return pre;
    }
    
    public static void main(String[] args){
    	ListNode fst=new ListNode(1);
    	ListNode snd=new ListNode(1);
    	ListNode trd=new ListNode(2);
    	ListNode fth=new ListNode(1);
    	
    	fst.next=snd;
    	snd.next=trd;
    	trd.next=fth;
    	
    	Solution s=new Solution();
    	s.isPalindrome(fst);
    }
}