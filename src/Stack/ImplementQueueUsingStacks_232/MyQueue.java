package Stack.ImplementQueueUsingStacks_232;

import java.util.Stack;

class MyQueue {
	private Stack<Integer> stackIn=new Stack<Integer>();
	private Stack<Integer> stackOut=new Stack<Integer>();
	// Push element x to the back of queue.
    public void push(int x) {
    	stackIn.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(stackOut.isEmpty()){
        	while(!stackIn.isEmpty())
        		stackOut.push(stackIn.pop());
        }
        stackOut.pop();
    }

    // Get the front element.
    public int peek() {
    	if(stackOut.isEmpty()){
        	while(!stackIn.isEmpty())
        		stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackIn.isEmpty()&&stackOut.isEmpty();
    }
}