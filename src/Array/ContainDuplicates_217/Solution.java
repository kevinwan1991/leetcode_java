package Array.ContainDuplicates_217;

import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
        	return false;
        
        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
        for(int i=0; i<nums.length; i++){
        	if(map.containsKey(nums[i]))
        		return true;
        	else
        		map.put(nums[i], true);
        }
        return false;
    }
}