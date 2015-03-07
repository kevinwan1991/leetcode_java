package Stack.ValidParentheses_20;

import java.util.Stack;


public class Solution {
    public boolean isValid(String s) {
    	if(s==null || s.length()==0)
    		return true;
    	
    	Stack<Character> stack=new Stack<Character>();
    	char[] charArr=s.toCharArray();
    	for(int i=0; i<charArr.length; i++){
    		char tmp=charArr[i];
    		if(stack.isEmpty() || tmp=='(' || tmp=='[' || tmp=='{')
    			stack.push(tmp);
    		else{
    			char top=stack.pop();
    			
    			if((top=='(' && tmp==')') || (top=='[' && tmp==']') || (top=='{' && tmp=='}'))
    				continue;
    			else
    				return false;
    		}
    	}
    	if(stack.isEmpty())
    		return true;
    	else
    		return false;
    }

}
