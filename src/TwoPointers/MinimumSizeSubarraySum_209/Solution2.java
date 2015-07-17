package TwoPointers.MinimumSizeSubarraySum_209;

public class Solution2 {
    public int minSubArrayLen(int s, int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	
    	int start,end,sum,min;
    	min=Integer.MAX_VALUE;
    	start=sum=0;
    	end=-1;
    	
    	while(start<nums.length && end<nums.length){
    		if(sum<s){
    			end++;
    			if(end<nums.length)
    				sum+=nums[end];
    		}else{
    			int len=end-start+1;
    			min=Math.min(min, len);
    			sum-=nums[start];
    			start++;
    		}
    	}
    	return min==Integer.MAX_VALUE?0:min;
    }
}   