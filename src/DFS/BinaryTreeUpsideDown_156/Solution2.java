package DFS.BinaryTreeUpsideDown_156;

public class Solution2 {
	// Look at only himself:
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root==null)
            return null;
        
        TreeNode node=root;
        TreeNode left=null;
        TreeNode right=null;
        TreeNode parent=null;
        
        while(node!=null){
            left=node.left;
            node.left=right;
            
            right=node.right;
            node.right=parent;
            
            parent=node;
            node=left;
        }
        return parent;
    }
}