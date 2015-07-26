package BackTracking.CombinationPartitionIII_216;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    	List<List<Integer>> resList=new ArrayList<List<Integer>>();
    	List<Integer> tmpList=new ArrayList<Integer>();
        
        helper(1,tmpList,resList,k,n);
        return resList;
    }
    
    public void helper(int start,List<Integer> tmpList, List<List<Integer>> resList, int k, int sum){
    	if(sum==0 && tmpList.size()==k){
    		resList.add(new ArrayList<Integer>(tmpList));
    		return;
    	}
    	
    	for(int i=start; i<10; i++){
    		if(sum-i<0 || tmpList.size()>k)
    			return;
    		
			tmpList.add(i);
			helper(i+1,tmpList,resList,k,sum-i);
			tmpList.remove(tmpList.size()-1);
    	}
    }
}
