package DP.HouseRobber_198;

// There must be a corresponding two-pointers way!!!!
public class Solution_TwoPointers {
    public int rob(int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	
    	// Not have to be a position, can be temporary value!!!!
    	int even=0;
    	int odd=0;
    	for(int i=0; i<nums.length; i++){
    		if(i%2==1){
    			odd+=nums[i];
    			odd=Math.max(odd, even);
    		}else{
    			even+=nums[i];
    			even=Math.max(odd, even);
    		}
    	}
    	return Math.max(odd, even);
    }
}
