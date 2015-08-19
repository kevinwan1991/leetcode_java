package DFS.MinimumDepthOfBinaryTree_111;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        return helper(root,0);
    }
    
    public int helper(TreeNode node,int depth){
        if(node.left==null && node.right==null)
            return depth+1;
        
        int leftDepth=Integer.MAX_VALUE;
        if(node.left!=null)
            leftDepth=helper(node.left,depth+1);
        
        int rightDepth=Integer.MAX_VALUE;
        if(node.right!=null)
            rightDepth=helper(node.right,depth+1);

        return Math.min(leftDepth,rightDepth);
    }
}