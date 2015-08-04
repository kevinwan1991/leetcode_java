package Stack.BinaryTreeInorderTraversal_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
        	return new ArrayList<Integer>();
        
        List<Integer> resList=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        
        TreeNode pt=root;
        
        while(!stack.isEmpty() || pt!=null){
        	if(pt!=null){
        		stack.push(pt);
        		pt=pt.left;
        	}else{
        		TreeNode top=stack.pop();
        		resList.add(top.val);
        		pt=top.right;
        	}
        }
        return resList;
    }
}