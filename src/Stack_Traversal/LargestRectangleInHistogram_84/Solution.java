package Stack_Traversal.LargestRectangleInHistogram_84;

import java.util.Stack;

public class Solution {
	// Maybe it's good to review this question once in a while;
	// Too difficult to maintain using a stack;
    public int largestRectangleArea(int[] height) {
    	if(height==null || height.length==0)
    		return 0;
    	
    	Stack<Integer> stack=new Stack<Integer>();
    	
    	int i=0;
    	int max=0;
    	while(i<height.length){
    		if(stack.isEmpty() || height[i]>=height[stack.peek()]){
    			stack.push(i);
    			i++;
    		}else{
    			int tall=height[stack.pop()];
    			int width=stack.isEmpty()?i:((i-1)-stack.peek());
    			max=Math.max(max, tall*width);
    		}
    	}
    	
    	while(!stack.isEmpty()){
    		int tall=height[stack.pop()];
			int width=stack.isEmpty()?i:((i-1)-stack.peek());
			max=Math.max(max, tall*width);
    	}
    	return max;
    }
}