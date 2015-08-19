package DFS.ContructBinaryTreeFromInPosOrder_106;

import java.util.HashMap;

public class Solution2 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null ||  postorder==null || inorder.length!=postorder.length || inorder.length==0 || postorder.length==0)
            return null;
            
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i],i);
        
        return helper(map,inorder,postorder,0,inorder.length-1,0,inorder.length-1);
    }
    
    public TreeNode helper(HashMap<Integer,Integer> map,int[] inorder,int[] postorder,int startI,int endI,int startP,int endP){
        if(startI==endI)
            return new TreeNode(inorder[startI]);
        if(startI<endI){
	        TreeNode node=new TreeNode(postorder[endP]);
	        
	        int pivotal=map.get(postorder[endP]);
	        node.left=helper(map,inorder,postorder,startI,pivotal-1,startP,startP+(pivotal-startI-1));
	        node.right=helper(map,inorder,postorder,pivotal+1,endI,startP+(pivotal-startI),endP-1);
	        
	        return node;
        }else
        	return null;
    }
}