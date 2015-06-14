package DP.MaximumProductSubarray_152;

public class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        if(nums.length==1)
        	return nums[0];
        
        int[] maxTil=new int[nums.length];//maximum absolute value from previous contiguous to current! 
        int[] minTil=new int[nums.length];
        
        maxTil[0]=nums[0]>0?nums[0]:0;
        minTil[0]=nums[0]<0?nums[0]:0;
        
        int max=maxTil[0];
        for(int i=1; i<nums.length; i++){
        	if(nums[i]>=0){
        		maxTil[i]=Math.max(nums[i],nums[i]*maxTil[i-1]);
        		minTil[i]=nums[i]*minTil[i-1];
        		max=Math.max(max, maxTil[i]);
        	}else{
        		minTil[i]=Math.min(nums[i],nums[i]*maxTil[i-1]);
        		maxTil[i]=nums[i]*minTil[i-1];
        		max=Math.max(max, maxTil[i]);
        	}
        }
        return max;
    }
}