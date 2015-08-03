package HashMap.ContainsDuplicates_217;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if(nums==null || nums.length<2)
    		return false;
    	HashSet<Integer> set=new HashSet<Integer>();
    	for(int num:nums){
    		if(set.contains(num))
    			return true;
    		set.add(num);
    	}
    	return false;
    }
}