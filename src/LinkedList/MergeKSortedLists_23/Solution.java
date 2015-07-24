package LinkedList.MergeKSortedLists_23;

// Mimic MergeSort way:
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists==null)
    		return null;
    	
    	return mergeKLists(lists,0,lists.length-1);	
    }
    
    public ListNode mergeKLists(ListNode[] lists, int start, int end){
    	if(start==end)
    		return lists[start];
    	if(start>end)
    		return null;
    	if(end-start==1)
    		return merge(lists[start],lists[end]);
    	
    	int mid=(start+end)/2;
    	
    	ListNode leftList=mergeKLists(lists,start,mid);
    	ListNode rightList=mergeKLists(lists,mid+1,end);
    	return merge(leftList,rightList);
    }
    
    public ListNode merge(ListNode leftList, ListNode rightList){
    	ListNode pt1,pt2,pt;
    	pt1=leftList;
    	pt2=rightList;
    	
    	ListNode fakeHead=new ListNode(0);
    	pt=fakeHead;
    	
    	while(pt1!=null || pt2!=null){
    		if(pt1==null || (pt1!=null && pt2!=null && pt1.val>=pt2.val)){
    			ListNode tmp=pt2.next;
    			pt.next=pt2;
    			pt2.next=null;
    			
    			pt2=tmp;
    			pt=pt.next;
    		}else if(pt2==null || (pt1!=null && pt2!=null && pt1.val<pt2.val)){
    			ListNode tmp=pt1.next;
    			pt.next=pt1;
    			pt1.next=null;
    			
    			pt1=tmp;
    			pt=pt.next;
    		}
    	}
    	return fakeHead.next;
    }
}