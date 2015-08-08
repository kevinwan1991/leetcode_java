package DP.MaximumRectangle_85;

import java.util.Stack;

public class Solution {
	// No way to traverse, then  use DP;
	// Take 2D as charts!!
    public int maximalRectangle(char[][] matrix) {
    	if(matrix==null || matrix.length==0 || matrix[0].length==0)
    		return 0;
    	
    	int[][] height=new int[matrix.length][matrix[0].length];
    	for(int i=0; i<matrix.length; i++){
    		for(int j=0; j<matrix[0].length; j++){
    			if(matrix[i][j]=='1'){
    				height[i][j]=i==0?1:height[i-1][j]+1;
    			}else{
    				height[i][j]=0;
    			}
    		}
    	}
    	
    	int max=0;
    	for(int i=0; i<matrix.length; i++){
    		int area=largestRectangleArea(height[i]);
    		max=Math.max(max, area);
    	}
    	return max;
    }
    
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