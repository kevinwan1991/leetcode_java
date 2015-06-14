package Stack.ImpStackUsingQueues_225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> q1=new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        q1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        for(int i=0; i<q1.size()-1; i++){
        	int tmp=q1.poll();
        	q1.add(tmp);
        }
        q1.poll();	
    }

    // Get the top element.
    public int top() {
    	for(int i=0; i<q1.size()-1; i++){
        	int tmp=q1.poll();
        	q1.add(tmp);
        }
        int res=q1.poll();
        q1.add(res);
        return res;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}