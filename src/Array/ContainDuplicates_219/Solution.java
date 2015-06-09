package Array.ContainDuplicates_219;

import java.util.HashMap;

public class Solution {
	//Find one pair gap<k:
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null || nums.length<2 || k<0)
        	return false;
        
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
        	if(map.containsKey(nums[i])){
        		int preIndex=map.get(nums[i]);
        		int gap=i-preIndex;
        		min=Math.min(min, gap);
        	}
        	map.put(nums[i], i);
        }
        
        return (min<=k)?true:false;
    }
}