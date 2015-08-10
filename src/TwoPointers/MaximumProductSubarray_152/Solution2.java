package TwoPointers.MaximumProductSubarray_152;

public class Solution2 {
    public int maxProduct(int[] nums) {
    	if(nums==null || nums.length==0)
        	return 0;
        if(nums.length==1)
        	return nums[0];
        
        // The difference of this question with dp is that there won't be a case where i>0,j<len, that (i,j)get the max value;
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1; i<nums.length; i++){
        	int tmp=max;
        	max=Math.max(Math.max(max*nums[i],nums[i]),min*nums[i]);
        	min=Math.min(Math.min(min*nums[i],nums[i]),tmp*nums[i]);
        	res=Math.max(max,res);
        }
        return res;
    }
}