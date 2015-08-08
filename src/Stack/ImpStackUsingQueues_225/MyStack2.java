package Stack.ImpStackUsingQueues_225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack2 {
	Queue<Integer> queue=new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        for(int i=0; i<queue.size()-1; i++){
        	int tmp=queue.poll();
        	queue.add(tmp);
        }
        queue.poll();
    }

    // Get the top element.
    public int top() {
    	for(int i=0; i<queue.size()-1; i++){
        	int tmp=queue.poll();
        	queue.add(tmp);
        }
        int top=queue.poll();
        queue.add(top);
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
       return queue.isEmpty();
    }
}