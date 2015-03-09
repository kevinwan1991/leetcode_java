package Stack.Infix2Posfix;

import java.util.Stack;

public class Solution {
	public String infix2posfix(String infix){
		Stack<Character> stack=new Stack<Character>();
		char[] charArr=infix.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<charArr.length; i++){
			char opera=charArr[i];
			if(opera=='+' || opera=='-'){
				if(stack.isEmpty() || stack.peek()=='(')
					stack.push(opera);
				else{	
					while(!stack.isEmpty() && stack.peek()=='*' && stack.peek()=='/' || stack.peek()=='+' && stack.peek()=='-')
						sb.append(stack.pop());
					stack.push(opera);
				}
			}else if(opera=='*' || opera=='/'){
				if(stack.isEmpty() || stack.peek()=='(' || stack.peek()=='+' || stack.peek()=='-')
					stack.push(opera);
				else{
					while(!stack.isEmpty() && stack.peek()=='*' && stack.peek()=='/')
						sb.append(stack.pop());
					stack.push(opera);
				}
			}else if(opera=='('){
				stack.push(opera);
			}else if(opera==')'){
				while(stack.peek()!='(')
					sb.append(stack.pop());
				stack.pop();
			}else
				sb.append(opera);
		}
		
		while(!stack.isEmpty())
			sb.append(stack.pop());
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		System.out.print(solution.infix2posfix("((1*4)+5*9)*3"));
	}
}
