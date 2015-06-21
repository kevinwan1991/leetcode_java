package DFS.ContructBinaryTreeFromInPosOrder_106;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	int[] inorder;
	int[] postorder;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length==0 || postorder.length==0 || inorder.length!=postorder.length)
        	return null;
        
    	this.inorder=inorder;//Arrays.copyOf(inorder,inorder.length);
    	this.postorder=postorder;//Arrays.copyOf(postorder,postorder.length);
    	for(int i=0; i<inorder.length; i++)
    		map.put(inorder[i], i);
    	
    	TreeNode root=new TreeNode(0);
    	root=helper(0,inorder.length-1,0,inorder.length-1,root);
    	return root;
    }
    
    //Java pass by value, node if not return, will not remember the added value!!!
    public TreeNode helper(int leftP,int rightP,int leftI,int rightI,TreeNode node){
    	if(leftP==rightP){
    		node=new TreeNode(postorder[rightP]);
    		return node;
    	}
    	
    	node=new TreeNode(postorder[rightP]);
    	
    	int position=map.get(postorder[rightP]);
    	int range=rightI-position;
    	
    	//first handle right-hand side:
    	if(position!=rightI)//I fail to notice that!!!
    		node.right=helper(rightP-range,rightP-1,position+1,position+range,node.right);
    	//second handle left-hand side:
    	if(position!=leftI)//I fail to notice that!!!
    		node.left=helper(leftP,rightP-range-1,leftI,position-1,node.left);
    	return node;
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	int[] a=new int[]{-1};
    	int[] b=new int[]{-1};
    	s.buildTree(a, b);
    }
}