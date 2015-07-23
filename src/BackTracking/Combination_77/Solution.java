package BackTracking.Combination_77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> resList=new ArrayList<List<Integer>>();
        List<Integer> tmpList=new ArrayList<Integer>();
    	
        if(k>n)
        	return resList;
        helper(1,k,n,tmpList,resList);
        return resList;
    }
    
    public void helper(int start,int k,int n, List<Integer> tmpList, List<List<Integer>> resList){
    	if(tmpList.size()==k){
    		resList.add(new ArrayList<Integer>(tmpList));
    		return;
    	}
    	for(int i=start; i<=n; i++){
    		tmpList.add(i);
    		helper(i+1,k,n,tmpList,resList);
    		tmpList.remove(tmpList.size()-1);
    	}
    }
}