package TwoPointers.MaximumSubarray_53;

public class SolutionTwoPointers {
    public int maxSubArray(int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	
    	int max=nums[0];
    	int tmpSum=nums[0];
    	int curr=1;
    	while(curr<nums.length){
    		if(tmpSum<0)
				tmpSum=nums[curr];
    		else
    			tmpSum+=nums[curr];
    		max=Math.max(max, tmpSum);
			curr++;
    	}
    	return max;
   }
}