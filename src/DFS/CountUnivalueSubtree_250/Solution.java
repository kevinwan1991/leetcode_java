package DFS.CountUnivalueSubtree_250;

public class Solution {
    private int num=0;
    public int countUnivalSubtrees(TreeNode root) {
        if(root==null)
            return 0;
            
        helper(root);
        return this.num;
    }
    
    public boolean helper(TreeNode node){
        if(node.left==null && node.right==null){
            this.num++;
            return true;
        }
        
        if(node.left!=null && node.right==null && helper(node.left)){
            if(node.val==node.left.val){
                this.num++;
                return true;
            }
            return false;
        }
        
        if(node.left==null && node.right!=null && helper(node.right)){
            if(node.val==node.right.val){
                this.num++;
                return true;
            }
            return false;
        }
        
        if(node.left!=null && node.right!=null){
            boolean left=helper(node.left); 
            boolean right=helper(node.right);
            
            //watch out for helper(x1)&&helper(x2)!!!!
            //if helper(x1) fail, helper(x2) won't execute!!!!!!!!!!
            if(left && right && node.val==node.left.val && node.val==node.right.val){
                this.num++;
                return true;
            }
            return false;
        }
        return false;
    }
}