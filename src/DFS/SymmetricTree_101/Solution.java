package DFS.SymmetricTree_101;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        
        return isSym(root.left,root.right);
    }
    
    public boolean isSym(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null)
            return true;
        else if((node1==null && node2!=null) || (node1!=null && node2==null))
            return false;
        else if(node1.val!=node2.val)
            return false;
        else{
            return isSym(node1.left,node2.right) && isSym(node1.right,node2.left);
        }
    }
}