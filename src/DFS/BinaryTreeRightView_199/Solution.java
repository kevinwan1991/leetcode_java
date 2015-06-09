package DFS.BinaryTreeRightView_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	//Find out rightmost one on each level:
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> resList=new ArrayList<Integer>();
    	if(root==null)
    		return resList;
    	
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	queue.add(root);
    	int curNum=1;
    	int nextNum=0;
    	
    	while(!queue.isEmpty()){
    		TreeNode tmpNode=queue.poll();
    		curNum--;
    		if(curNum==0)
    			resList.add(tmpNode.val);
    		if(tmpNode.left!=null){
    			queue.add(tmpNode.left);
    			nextNum++;
    		}
    		if(tmpNode.right!=null){
    			queue.add(tmpNode.right);
    			nextNum++;
    		}
    		if(curNum==0){	
    			curNum=nextNum;
    			nextNum=0;
    		}
    	}
    	return resList;
    }
}