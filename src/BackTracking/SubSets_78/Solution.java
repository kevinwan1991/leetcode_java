package BackTracking.SubSets_78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> resList=new ArrayList<List<Integer>>();
    	resList.add(new ArrayList<Integer>());
    	
    	List<Integer> tmpList=new ArrayList<Integer>();
        
    	HashSet<List<Integer>> set=new HashSet<List<Integer>>(); 
        set.add(new ArrayList<Integer>());
        
        Arrays.sort(nums);
        if(nums==null || nums.length==0)
        	return resList;
        
        helper(0,tmpList,resList,set,nums);
        return resList;
    }
    
    public void helper(int start,List<Integer> tmpList, List<List<Integer>> resList, HashSet<List<Integer>> set,int[] nums){
    	if(!set.contains(tmpList)){
    		resList.add(new ArrayList<Integer>(tmpList));
    		set.add(new ArrayList<Integer>(tmpList));
    	}
    	for(int i=start; i<nums.length; i++){
    		tmpList.add(nums[i]);
    		helper(i+1,tmpList,resList,set,nums);
    		tmpList.remove(tmpList.size()-1);
    	}
    }
}