package LinkedList.CopyListWithRandomPointer_138;

import java.util.HashMap;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	// Node cannot be accurately located, but with a hashmap we can:
    	if(head==null)
    		return null;
    	
    	HashMap<RandomListNode,RandomListNode> map=new HashMap<RandomListNode,RandomListNode>();
    	
    	RandomListNode pt1,pt2,fakeHead1,fakeHead2;
    	fakeHead1=new RandomListNode(0);
    	fakeHead1.next=head;
    	fakeHead2=new RandomListNode(0);
    	
    	pt1=fakeHead1;
    	pt2=fakeHead2;
    	while(pt1.next!=null){
    		RandomListNode tmp=new RandomListNode(pt1.next.label);
    		pt2.next=tmp;
    		map.put(pt1.next,pt2.next);
    		
    		pt1=pt1.next;
    		pt2=tmp;
    	}
    	
    	pt1=fakeHead1.next;
    	pt2=fakeHead2.next;
    	while(pt1!=null || pt2!=null){
    		if(pt1.random!=null){
    			RandomListNode random2=map.get(pt1.random);
    			pt2.random=random2;
    		}
    		pt1=pt1.next;
    		pt2=pt2.next;
    	}
    	return fakeHead2.next;
    }
}