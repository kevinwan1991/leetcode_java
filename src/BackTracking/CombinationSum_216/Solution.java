package BackTracking.CombinationSum_216;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> resList=new ArrayList<List<Integer>>();
        ArrayList<Integer> tmpList=new ArrayList<Integer>();
        
        helper(resList,tmpList,1,k,n);
        return resList;
    }
    
    public void helper(List<List<Integer>> resList,List<Integer> tmpList, int start, int k, int sum){
    	if(sum==0 && tmpList.size()==k){
    		resList.add(new ArrayList<Integer>(tmpList));
    		return;
    	}
    	for(int i=start; i<=9; i++){
    		if(sum-i<0)
    			break;
    		if(tmpList.size()>k)
    			break;
			tmpList.add(i);
			helper(resList,tmpList,i+1,k,sum-i);
			tmpList.remove(tmpList.size()-1);
    	}
    }
}