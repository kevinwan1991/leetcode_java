package TwoPointers.MinimumSizeSubarraySum_209;

//Do more on this question!
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        
        int left=0;
        int right=0;
        int curSum=nums[0];
        int minLen=Integer.MAX_VALUE;
        while(right<nums.length){
        	if(left==right){
        		if(nums[right]<s){
        			right++;
        			if(right<nums.length)	
        				curSum+=nums[right];
        		}else{
        			return 1;
        		}
        	}else{
        		if(curSum<s){
        			right++;
        			if(right<nums.length)	
        				curSum+=nums[right];            		
            	}else{
            		minLen=Math.min(minLen, right-left+1);//what if right=left??
            		curSum-=nums[left];
            		left++;//may cause left>right!
            	}
        	}
        }    
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}