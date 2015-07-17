package HashSet.LongestConsecutivesSequence_128;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        
        HashSet<Integer> set=new HashSet<Integer>();
        for(int num: nums)
        	set.add(num);
        
        int max=1;
        for(int num: nums){
        	int left=num-1;
        	int right=num+1;
        	int count=1;
        	
        	while(set.contains(left)){
        		count++;
        		set.remove(left--);
        	}
        	while(set.contains(right)){
        		count++;
        		set.remove(right++);
        	}
        	max=Math.max(count, max);
        }
        return max;
    }
}