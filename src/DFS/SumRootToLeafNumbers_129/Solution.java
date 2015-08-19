package DFS.SumRootToLeafNumbers_129;

public class Solution {
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        helper(root,"");
        return this.sum;
    }
    
    public void helper(TreeNode node,String str){
    	//Judge if it is a leaf!!!
        if(node.left==null && node.right==null){
            sum+=(Integer.parseInt(str+node.val));
            return;
        }
        // use if(node==null) doesn't specifically decide the type of node!   
        if(node.left!=null)
            helper(node.left,str+node.val);
       
        if(node.right!=null)
            helper(node.right,str+node.val);
    }
}