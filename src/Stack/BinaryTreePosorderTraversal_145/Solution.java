package Stack.BinaryTreePosorderTraversal_145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
        	return new ArrayList<Integer>();
        
        List<Integer> resList=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        
        TreeNode curr=root;
        TreeNode prev=null;
        stack.push(root);
        
        while(!stack.isEmpty()){
        	curr=stack.peek();
        	if(prev==null || prev.left==curr || prev.right==curr){
        		if(curr.left!=null)
        			stack.push(curr.left);
        		else if(curr.right!=null)
        			stack.push(curr.right);
        		else{
        			stack.pop();
        			resList.add(curr.val);
        		}
        	}
        	else if(curr.left==prev){
        		if(curr.right!=null)
        			stack.push(curr.right);
        		else{
        			stack.pop();
        			resList.add(curr.val);
        		}
        	}
        	else if(curr.right==prev){
        		stack.pop();
    			resList.add(curr.val);
        	}
        	prev=curr;
        }
        return resList;
    }
}