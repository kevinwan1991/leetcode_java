package BackTracking.PermutationSequence_60;

import java.util.ArrayList;
import java.util.List;

// No need of backtracking to get all stuff!
public class Solution_timeOut {
	public String getPermutation(int n, int k) {
        List<List<Integer>> resList=new ArrayList<List<Integer>>();
        if(n==1)
        	return "1";

        int max=1;
        for(int i=1; i<=n; i++)
        	max*=i;
        if(k>max)
        	return null;
        
        boolean[] ifPicked=new boolean[n+1];
        List<Integer> tmpList=new ArrayList<Integer>();
        
        helper(tmpList,resList,n,k,ifPicked);
        
        tmpList=resList.get(k-1);
        StringBuilder sb=new StringBuilder();
        for(int tmp:tmpList)
        	sb.append(tmp);
        return sb.toString();
    }
    
	
	public void helper(List<Integer> tmpList, List<List<Integer>> resList,int n,int k,boolean[] ifPicked){
		if(resList.size()==k)
			return;
		if(tmpList.size()==n){
			resList.add(new ArrayList<Integer>(tmpList));
    		return;
    	}
    	
    	for(int i=1; i<=n; i++){
    		if(!ifPicked[i]){
    			tmpList.add(i);
    			ifPicked[i]=true;
    			
    			helper(tmpList,resList,n,k,ifPicked);
    			
    			tmpList.remove(tmpList.size()-1);
    			ifPicked[i]=false;
    		}
    	}
    }
}
