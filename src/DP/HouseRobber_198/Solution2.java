package DP.HouseRobber_198;

public class Solution2 {
    public int rob(int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	if(nums.length==1)
    		return nums[0];
    	if(nums.length==2)
    		return Math.max(nums[0],nums[1]);
    	if(nums.length==3)
    		return Math.max(nums[0]+nums[2],nums[1]);

    	int[] maxUntil=new int[nums.length];
    	maxUntil[0]=nums[0];
    	maxUntil[1]=nums[1];
    	maxUntil[2]=nums[0]+nums[2];
    	for(int i=3; i<nums.length; i++)
    		maxUntil[i]=Math.max(maxUntil[i-2],maxUntil[i-3])+nums[i];
    	
    	return Math.max(maxUntil[nums.length-1], maxUntil[nums.length-2]);
    }
}