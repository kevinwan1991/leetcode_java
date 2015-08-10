package DFS.BalancedBinaryTree_110;

public class Solution {
	private boolean isBalanced=true;
    public boolean isBalanced(TreeNode root) {
    	helper(root,0);
    	return isBalanced;
    }
    
    public int helper(TreeNode node,int level){
    	if(node==null)
    		return level-1;
    	
    	int leftLevel=helper(node.left,level+1);
    	int rightLevel=helper(node.right,level+1);
    	if(Math.abs(leftLevel-rightLevel)>1)
    		isBalanced=false;
    	return Math.max(leftLevel,rightLevel);
    }
}