package Array.LongestConsecutiveSequence_128;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        
        HashSet<Integer> set=new HashSet<Integer>();
        for(int num:nums)
        	set.add(num);
        
        //Use hashset do partial sorting for you!!!!!!!
        int max=1;
        for(int num:nums){//cann't revise set while looping!!!
    		int count=1;
    		int left=num-1;
    		int right=num+1;
    		
    		while(set.contains(left)){
    			count++;
    			set.remove(left--);
    		}
    		
    		while(set.contains(right)){
    			count++;
    			set.remove(right++);
    		}
    		max=Math.max(max,count);
        }
        return max;
    }
}