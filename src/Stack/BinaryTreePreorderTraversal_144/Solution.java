package Stack.BinaryTreePreorderTraversal_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
        	return new ArrayList<Integer>();
        
        List<Integer> resList=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        
        TreeNode pt=root;
        
        while(!stack.isEmpty() || pt!=null){
        	if(pt!=null){
        		stack.push(pt);
        		resList.add(pt.val);
        		pt=pt.left;
        	}else{
        		TreeNode top=stack.pop();
        		pt=top.right;
        	}
        }
        return resList;
    }
}