package DFS.BinaryTreeRightSideShow_199;

import java.util.ArrayList;
import java.util.List;

//Nice DFS!!!! Parameter 'level' really helps!!!!!!!!
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> resList=new ArrayList<Integer>();
    	if(root==null)
    		return resList;
    	
    	helper(root,0,resList);
    	return resList;
    }
    
    public void helper(TreeNode node,int level,List<Integer> resList){
        if(node==null)
            return;
            
        if(level==resList.size())
            resList.add(node.val);
    
        helper(node.right,level+1,resList);
        helper(node.left,level+1,resList);
    }
}