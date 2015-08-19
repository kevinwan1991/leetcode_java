package DFS.PathSumII_113;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> resList=new ArrayList<List<Integer>>();
        List<Integer> tmpList=new ArrayList<Integer>();
        
        if(root==null)
            return resList;
            
        helper(root,0,sum,tmpList,resList);
        return resList;
    }
    
    public void helper(TreeNode node,int tmpSum,int sum,List<Integer> tmpList,List<List<Integer>> resList){
        if(node.left==null && node.right==null){
            tmpSum+=node.val;
            tmpList.add(node.val);
            if(tmpSum==sum)
                resList.add(new ArrayList<Integer>(tmpList));
            tmpList.remove(tmpList.size()-1);
        }else{
            tmpSum+=node.val;
            tmpList.add(node.val);
            if(node.left!=null)
                helper(node.left,tmpSum,sum,tmpList,resList);
            if(node.right!=null)
                helper(node.right,tmpSum,sum,tmpList,resList);
            tmpList.remove(tmpList.size()-1);
        }
    }
}