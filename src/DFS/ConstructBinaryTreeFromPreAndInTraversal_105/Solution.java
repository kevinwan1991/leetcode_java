package DFS.ConstructBinaryTreeFromPreAndInTraversal_105;

import java.util.HashMap;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if(inorder==null ||  preorder==null || inorder.length!=preorder.length || inorder.length==0 || preorder.length==0)
            return null;
            
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i],i);
        
        return helper(map,inorder,preorder,0,inorder.length-1,0,inorder.length-1);
    }
    
    public TreeNode helper(HashMap<Integer,Integer> map,int[] inorder,int[] preorder,int startI,int endI,int startP,int endP){
        if(startI==endI)
            return new TreeNode(inorder[startI]);
        if(startI<endI){
	        TreeNode node=new TreeNode(preorder[startP]);
	        
	        int pivotal=map.get(preorder[startP]);
	        node.left=helper(map,inorder,preorder,startI,pivotal-1,startP+1,startP+(pivotal-startI));
	        node.right=helper(map,inorder,preorder,pivotal+1,endI,startP+(pivotal-startI)+1,endP);
	        
	        return node;
        }else
        	return null;
    }
}