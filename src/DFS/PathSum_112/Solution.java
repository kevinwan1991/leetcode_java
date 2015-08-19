package DFS.PathSum_112;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        return helper(root,0,sum);
    }
    
    public boolean helper(TreeNode node,int tmpSum,int sum){
        if(node.left==null && node.right==null){
            if(tmpSum+node.val==sum)
                return true;
            return false;
        }
        
        boolean res=false;
        if(node.left!=null)
            res|=helper(node.left,tmpSum+node.val,sum);
        if(node.right!=null)
            res|=helper(node.right,tmpSum+node.val,sum);
        return res;            
    }
}