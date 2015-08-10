package Stack_Traversal.LongestValidParentheses_32;

import java.util.Stack;

public class Solution_re {
    public int longestValidParentheses(String s) {
        if(s==null || s.length()<=1)
            return 0;
            
        char[] arr=s.toCharArray();
        Stack<Integer> stack=new Stack<Integer>();
        
        int max=0;
        int start=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='(')
                stack.push(i);
            else if(arr[i]==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    if(!stack.isEmpty())
                        max=Math.max(max,i-stack.peek());
                    else
                        max=Math.max(max,i-start+1);
                }else{
                    start=i+1;
                }
            }
        }
        return max;        
    }
}