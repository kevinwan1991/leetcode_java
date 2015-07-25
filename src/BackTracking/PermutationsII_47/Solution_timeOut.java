package BackTracking.PermutationsII_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Failed of time limit
public class Solution_timeOut {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)
        	return resList;
        
        boolean[] ifPicked=new boolean[nums.length];
        HashSet<List<Integer>> set=new HashSet<List<Integer>>(); 
        List<Integer> tmpList=new ArrayList<Integer>();
        helper(tmpList,resList, set, nums, ifPicked);
        
        return resList;
    }
    
	
	public void helper(List<Integer> tmpList, List<List<Integer>> resList, HashSet<List<Integer>> set, int[] nums,boolean[] ifPicked){
    	if(tmpList.size()==nums.length){
    		if(!set.contains(tmpList)){
    			set.add(tmpList);
    			resList.add(new ArrayList<Integer>(tmpList));
    		}
    		return;
    	}
    	
    	for(int i=0; i<nums.length; i++){
    		if(!ifPicked[i]){
    			tmpList.add(nums[i]);
    			ifPicked[i]=true;
    			
    			helper(tmpList,resList,set,nums,ifPicked);
    			
    			tmpList.remove(tmpList.size()-1);
    			ifPicked[i]=false;
    		}
    	}
    }
}
