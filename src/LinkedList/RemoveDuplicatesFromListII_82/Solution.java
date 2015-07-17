package LinkedList.RemoveDuplicatesFromListII_82;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	//In case of deleting head:
    	ListNode header=new ListNode(0);
    	header.next=head;
    	
    	ListNode tmp=header;
    	//fix tmp and deal with nodes afterwards:
    	while(tmp.next!=null && tmp.next.next!=null){
    		if(tmp.next.val==tmp.next.next.val){
    			int dupVal=tmp.next.val;
    			while(tmp.next!=null && tmp.next.val==dupVal)
    				tmp.next=tmp.next.next;
    		}else
    			tmp=tmp.next;
    	}
    	return header.next;
    }
}