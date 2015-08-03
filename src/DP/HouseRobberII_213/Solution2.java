package DP.HouseRobberII_213;

//smart way is to consider only max[n] and max[n-1],max[n-2]:
// max[n]=max[n-1]or max[n-2]+nums[n];
public class Solution2 {
    public int rob(int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	if(nums.length==1)
    		return nums[0];
    	if(nums.length==2)
    		return Math.max(nums[0],nums[1]);
    	if(nums.length==3)
    		return Math.max(Math.max(nums[0],nums[1]),nums[2]);
    	
    	int[] maxUntil=new int[nums.length];
    	maxUntil[0]=nums[0];
    	maxUntil[1]=nums[1];
    	maxUntil[2]=nums[0]+nums[2];
    	for(int i=3;i<nums.length-1;i++)
    		maxUntil[i]=Math.max(maxUntil[i-2],maxUntil[i-3])+nums[i];
    	int possible1=Math.max(maxUntil[nums.length-2],maxUntil[nums.length-3]);
    	
    	maxUntil[0]=nums[1];
    	maxUntil[1]=nums[2];
    	maxUntil[2]=nums[1]+nums[3];
    	for(int i=3;i<nums.length-1;i++)
    		maxUntil[i]=Math.max(maxUntil[i-2],maxUntil[i-3])+nums[i+1];
    	int possible2=Math.max(maxUntil[nums.length-1],maxUntil[nums.length-2]);
    	
    	return Math.max(possible1, possible2);
    }
}