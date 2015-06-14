package DP.HouseRobber_198;

public class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        if(nums.length==1)
        	return nums[0];
        if(nums.length==2)
        	return Math.max(nums[0],nums[1]);
        if(nums.length==3)
        	return Math.max(nums[0]+nums[2],nums[1]);
        
        nums[2]+=nums[0];
        for(int i=3; i<nums.length; i++){
        	nums[i]+=Math.max(nums[i-2],nums[i-3]);
        }
        return Math.max(nums[nums.length-2], nums[nums.length-1]);
    }
}