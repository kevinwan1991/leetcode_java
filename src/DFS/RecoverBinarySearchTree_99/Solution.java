package DFS.RecoverBinarySearchTree_99;

public class Solution {
    private TreeNode preNode;
    private TreeNode first;
    private TreeNode second;
    
    public void recoverTree(TreeNode root) {
        if(root==null)
            return;
        
        preNode=null;
        first=null;
        second=null;
        
        helper(root);
        
        if(first!=null && second!=null){
            int tmp=first.val;
            first.val=second.val;
            second.val=tmp;
        }
        return;
    }
    
    public void helper(TreeNode node){
        if(node==null)
            return;
            
        helper(node.left);
        
        if(preNode==null)
            preNode=node;
        else{
            if(node.val<preNode.val){
                if(first==null){
                    first=preNode;
                }
                second=node;
            }
            preNode=node;
        }
        
        helper(node.right);
    }
}