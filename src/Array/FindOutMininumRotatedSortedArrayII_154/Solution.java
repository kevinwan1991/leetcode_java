package Array.FindOutMininumRotatedSortedArrayII_154;

public class Solution {
    public int findMin(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        
        int left=0,right=nums.length-1;
        while(left<=right){
        	//if(left==right)
        		//return nums[left];
        	if(left+1==right)
        		return Math.min(nums[left],nums[right]);
        	
        	int mid=(left+right)/2;
        	if(nums[left]<nums[right]){
        		return nums[left];
        	}else if(nums[left]==nums[right]){
        		left++;
        	}else if(nums[mid]>=nums[left]){
        		left=mid;
        	}else
        		right=mid;
        }
        return nums[right];
    }
}