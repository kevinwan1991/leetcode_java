package TwoPointers.MaximumSubarray_53;

public class Solution {
    public int maxSubArray(int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	
    	int[] maxEndAtI=new int[nums.length];
    	maxEndAtI[0]=nums[0];
    	for(int i=1; i<nums.length; i++)
    		maxEndAtI[i]=Math.max(maxEndAtI[i-1]+nums[i], nums[i]);
    	
    	int max=maxEndAtI[0];
    	for(int i=1; i<maxEndAtI.length; i++)
    		max=Math.max(max, maxEndAtI[i]);
    	
    	return max;
    }
}