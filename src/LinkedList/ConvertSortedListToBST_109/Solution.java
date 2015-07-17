package LinkedList.ConvertSortedListToBST_109;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head);
    }
    
    public TreeNode helper(ListNode head){
    	if(head==null)
    		return null;
    	if(head.next==null)
    		return new TreeNode(head.val);
    	
    	ListNode header=new ListNode(0);
    	header.next=head;
    	ListNode fast=head, slow=head, prev=header, head2;
    	while(fast!=null && fast.next!=null){//make it clear!!!
    		fast=fast.next.next;
    		slow=slow.next;
    		prev=prev.next;
    	}
    	
    	prev.next=null;
    	head2=slow.next;
    	slow.next=null;
    	
    	TreeNode middle=new TreeNode(slow.val);
    	middle.left=helper(head);
    	middle.right=helper(head2);
    	
    	return middle;
    }
    
    
    public static void main(String[] args){
    	ListNode node1=new ListNode(1);
    	ListNode node2=new ListNode(2);
    	node1.next=node2;
    	
    	Solution s=new Solution();
    	s.sortedListToBST(node1);
    	
    }
}