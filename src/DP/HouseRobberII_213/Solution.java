package DP.HouseRobberII_213;

public class Solution {
	// re-organize the dp relationship:
	// dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i])
	// one round from nums[1] to nums[n]
	// one round from nums[0] to nums[n-1]
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        if(nums.length==1)
        	return nums[0];
        if(nums.length==2)
        	return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums, 0,nums.length-2),helper(nums,1,nums.length-1));
    }
    
    public int helper(int[] nums,int start,int end){
    	int n=end-start+1;
    	int[] dp=new int[n];
    	dp[0]=nums[start];
    	dp[1]=Math.max(nums[start], nums[start+1]);
    	for(int i=2; i<n; i++){
    		dp[i]=Math.max(dp[i-1], dp[i-2]+nums[start+i]);
    	}
    	return dp[n-1];
    }
}