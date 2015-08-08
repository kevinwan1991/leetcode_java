package DFS.MaximumDepthOfBinaryTree_104;

public class Solution {
	private int max=0;
    public int maxDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	
    	helper(root,0);
    	return max;
    }
    
    public void helper(TreeNode node,int height){
    	if(node!=null){
    		height++;
    		max=Math.max(height, max);
    	}
    	
    	if(node.left!=null)
    		helper(node.left,height);
    	if(node.right!=null)
    		helper(node.right,height);
    }
}