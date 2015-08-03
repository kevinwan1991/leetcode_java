package DP.UniqueBinarySearchTreesII_95;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> resList=new ArrayList<TreeNode>();
        
    	if(n==0){
    		resList.add(null);
    		return resList;
    	}
    		
    	return helper(1,n);
    }
    
    public List<TreeNode> helper(int start,int end){
    	List<TreeNode> list=new ArrayList<TreeNode>();
    	
    	if(start>end){
    		list.add(null);
    		return list;
    	}
    		
    	for(int i=start; i<=end; i++){
    		List<TreeNode> leftList=helper(start,i-1);
    		List<TreeNode> rightList=helper(i+1,end);
    		for(TreeNode left:leftList){
    			for(TreeNode right:rightList){
    				TreeNode node=new TreeNode(i);
    				node.left=left;
    				node.right=right;
    				list.add(node);
    			}
    		}
    	}
    	return list;
    }
}