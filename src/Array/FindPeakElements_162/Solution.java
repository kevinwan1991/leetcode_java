package Array.FindPeakElements_162;

public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length<1)
        	return Integer.MIN_VALUE;
        
        if(nums.length==1)
        	return 0;
        if(nums[1]<nums[0])
        	return 0;
        if(nums[nums.length-2]<nums[nums.length-1])
        	return nums.length-1;
        
        for(int i=1; i<=nums.length-2; i++){
        	if((nums[i]-nums[i-1])*(nums[i]-nums[i+1])>0)
        		return i;
        }
        return Integer.MAX_VALUE;
    }
}