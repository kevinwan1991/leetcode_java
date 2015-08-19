package DFS.FlatternBinaryTreeToLinkedList_114;

public class Solution {
    private TreeNode lastVisited=null;
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        
        helper(root);
    }
    // when can't pass in and pass out, use global value;
    public void helper(TreeNode node){
        if(node==null)
            return;
        
        TreeNode realRight=node.right;
        
        if(lastVisited!=null){
            lastVisited.left=null;
            lastVisited.right=node;
        }
                
        lastVisited=node;
        helper(node.left);
        helper(realRight);
        
    }
    //Stack very is very interesting!!!
}