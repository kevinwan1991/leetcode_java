package DataStructure.LRUCache_146;

import java.util.HashMap;

public class LRUCache {
	private HashMap<Integer,DoubleLinkedListNode> map;
	private DoubleLinkedListNode head;
	private DoubleLinkedListNode tail;
	private int capacity;
	private int size;
	
    public LRUCache(int capacity) {
    	this.map=new HashMap<Integer,DoubleLinkedListNode>(); 
    	this.size=0;
        this.capacity=capacity;
    }
    
    public int get(int key) {
    	int res=-1;
        if(map.containsKey(key)){
        	DoubleLinkedListNode node=map.get(key);
            res=node.value;
            removeNode(node);
            setHead(node);
        }
        return res; 
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
        	DoubleLinkedListNode node=map.get(key);
        	node.value=value;
        	removeNode(node);
    		setHead(node);
        }else{
        	DoubleLinkedListNode node=new DoubleLinkedListNode(key,value);
        	if(size<capacity){
        		setHead(node);
        		map.put(key, node);
        		size++;
        	}else{
        		map.remove(tail.key);
        		removeNode(tail);
        		setHead(node);
        		map.put(key, node);
        	}
        }
    }
    
    protected void removeNode(DoubleLinkedListNode node){
    	DoubleLinkedListNode pre=node.prev;
    	DoubleLinkedListNode pos=node.next;
    	if(pre!=null)
    		pre.next=pos;
    	else
    		head=pos;
    	if(pos!=null)
    		pos.prev=pre;
    	else
    		tail=pre;
    }
    
    protected void setHead(DoubleLinkedListNode node){
    	node.prev=null;
    	node.next=head;
    	
    	if(head!=null)
    		head.prev=node;
    	head=node;
    	
    	if(tail==null)
    		tail=node;
    }
    
    
    private class DoubleLinkedListNode{
    	protected int key;
    	protected int value;
    	protected DoubleLinkedListNode prev;
    	protected DoubleLinkedListNode next;
    	
    	public DoubleLinkedListNode(int key, int value){
    		this.key=key;
    		this.value=value;
    	}
    }
    
}
