package BackTracking.GenerateParentheses_22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> resList=new ArrayList<String>();
        if(n==0)
        	return resList;
        
        helper(resList,n,n,"");
        return resList;
    }
    
    public void helper(List<String> resList,int left,int right,String str){
    	if(left>right)
    		return;
    	if(left==0 && right==0){
    		resList.add(str);
    		return;
    	}
    	if(left>0){
    		String tmp=str+"(";
    		helper(resList,left-1,right,tmp);
    		str=str;//remove last from tmp
    	}
    	if(right>0)
    		helper(resList,left,right-1,str+")");
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	s.generateParenthesis(1);
    }
}