package Greedy.JumpGame_55;

public class Solution {
    public boolean canJump(int[] nums) {
    	if(nums==null ||nums.length==0)
    		return false;
    	
    	int maxReach=0;
    	for(int i=0; i<nums.length && i<=maxReach; i++){
    		maxReach=Math.max(maxReach, i+nums[i]);
    		if(maxReach>=nums.length-1)
    			return true;
    	}
    	return false;
    }
    // Greedy question is light-weighted DP or Backtrack question;
    // usually solved by 1 loop;
    // one value or one relation able to determine fail or continue, say maxReach vs i, total for gas station;
}