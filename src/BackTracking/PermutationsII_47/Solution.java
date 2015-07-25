package BackTracking.PermutationsII_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)
        	return resList;
        
        boolean[] ifPicked=new boolean[nums.length];
        //HashSet<List<Integer>> set=new HashSet<List<Integer>>(); 
        List<Integer> tmpList=new ArrayList<Integer>();
        
        Arrays.sort(nums);
        helper(tmpList,resList, nums, ifPicked);
        
        return resList;
    }
    
	
	public void helper(List<Integer> tmpList, List<List<Integer>> resList, int[] nums, boolean[] ifPicked){
    	if(tmpList.size()==nums.length){
			resList.add(new ArrayList<Integer>(tmpList));
    		return;
    	}
    	
    	for(int i=0; i<nums.length; i++){
    		if(i>0 && nums[i]==nums[i-1] && !ifPicked[i-1])
    			continue;
    		if(!ifPicked[i] ){
    			tmpList.add(nums[i]);
    			ifPicked[i]=true;
    			
    			helper(tmpList,resList,nums,ifPicked);
    			
    			tmpList.remove(tmpList.size()-1);
    			ifPicked[i]=false;
    		}
    	}
    }
}
