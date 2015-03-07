package Stack.MinStack_155;

import java.util.Stack;

class MinStack {
	private Stack<Integer> stack=new Stack<Integer>();
	private Stack<Integer> minStack=new Stack<Integer>();
	
    public void push(int x) {
    	if(stack.isEmpty() || x<=minStack.peek())
    		minStack.push(x);
    	stack.push(x);
    }

    public void pop() {
    	if(stack.peek().equals(minStack.peek())) //They are object!
    		minStack.pop();
    	stack.pop();
    }

    public int top() {
        if(!stack.isEmpty())
        	return stack.peek();
        return -1;
    }

    public int getMin() {
    	if(!minStack.isEmpty())
        	return minStack.peek();
        return -1;
    }
}
