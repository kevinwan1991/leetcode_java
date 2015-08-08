package Stack_Traversal.LongestValidParentheses_32;

import java.util.Stack;

//One time traversal with stack: longestValidParenthese;LargestRectangleHistogram;
//Stack to store index, and take out unsure position!!!
public class Solution {
    public int longestValidParentheses(String s) {
        char[] arr=s.toCharArray();
        Stack<Integer> stack=new Stack<Integer>();
        int max=0;
        
        int i=0;
        int start=0;
        while(i<arr.length){
        	if(arr[i]=='(')
        		stack.add(i);
        	else if(arr[i]==')' && stack.isEmpty())
        		start=i+1;
        	else if(arr[i]==')' && !stack.isEmpty()){
        		stack.pop();
        		max=stack.isEmpty()?Math.max(max,i-start+1):Math.max(max, i-stack.peek());
        	}
        	i++;
        }
        return max;
    }
}