package DFS.TreeMaxPathSum_124;

public class Solution {
	private int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
    	if(root==null)
    	   return 0;
    	helper(root);
    	return max;
    }
    
    public int helper(TreeNode node){
    	if(node.left==null && node.right==null){
    		max=Math.max(max, node.val);
    		return node.val;
    	}
    		
    	int leftMax=0,rightMax=0;
    	if(node.left!=null)
    		leftMax=Math.max(0,helper(node.left));
    	if(node.right!=null)
    		rightMax=Math.max(0,helper(node.right));
    	max=Math.max(max, leftMax+rightMax+node.val);
    	return node.val+Math.max(leftMax, rightMax);
    }
}