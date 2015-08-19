package DFS.BinaryTreeUpsideDown_156;

//Recursion memory exceeds:
public class Solution {
    private TreeNode newHead;
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root==null)
            return null;
            
        helper(root);
        return this.newHead;
    }
    
    public TreeNode helper(TreeNode node){
        if(node.left==null && node.right==null){
            this.newHead=node;//new TreeNode(node.val);
            return node;
        }
            
        TreeNode newPar=helper(node.left);
        newPar.left=node.right;
        newPar.right=node;
        return node;
    }
}