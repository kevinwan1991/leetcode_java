package BinarySearch.SearchInRotatedSortedArray_81;

public class Solution {
    public boolean search(int[] nums, int target) {
    	if(nums==null || nums.length==0)
    		return false;
    	
    	int start=0;
    	int end=nums.length-1;
    	while(start<=end){
    		if(start==end)
    			return target==nums[start];
    		
    		if(nums[start]==nums[end]){
    			end--;
    			continue;
    		}
    		
    		int mid=(start+end)/2;
    		
    		if(nums[mid]==target)
    			return true;
    		
    		if(nums[start]<=nums[mid]){//although no duplicates!! 8,0: mid is also 8!
    			if(nums[start]<=target && target<nums[mid]){
    				end=mid-1;
    			}else{
    				start=mid+1;
    			}
    		}else if(nums[mid]<=nums[end]){
    			if(nums[mid]<target && target<=nums[end]){
    				start=mid+1;
    			}else{
    				end=mid-1;
    			}
    		}
    	}
    	return false;
    }
}