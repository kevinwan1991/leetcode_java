package BackTracking.Permutations_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)
        	return resList;
        
        HashSet<Integer> set=new HashSet<Integer>(); 
        List<Integer> tmpList=new ArrayList<Integer>();
        helper(0,tmpList,resList, set, nums);
        
        return resList;
    }
    
	public void helper(int start,List<Integer> tmpList, List<List<Integer>> resList, HashSet<Integer> set, int[] nums){
    	if(tmpList.size()==nums.length){
    		resList.add(new ArrayList<Integer>(tmpList));
    		return;
    	}
    	
    	for(int i=start; i<nums.length; i++){
    		if(!set.contains(i)){
    			tmpList.add(nums[i]);
    			set.add(i);
    			
    			helper(0,tmpList,resList,set,nums);
    			
    			tmpList.remove(tmpList.size()-1);
    			set.remove(i);
    		}
    	}
    }
}
