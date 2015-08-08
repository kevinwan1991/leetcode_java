package BinarySearch.SearchInARotatedSortedArray_33;

public class Solution {
    public int search(int[] nums, int target) {
    	if(nums==null || nums.length==0)
    		return -1;
    	
    	int start=0, end=nums.length-1;
    	while(start<=end){
    		if(start==end)
    			return target==nums[start]?start:-1;
    		
    		if(start+1==end){
    			if(target==nums[start])
    				return start;
    			if(target==nums[start+1])
    				return start+1;
    			return -1;
    		}
    		
    		int mid=(start+end)/2;
    		if(nums[mid]==target)
    			return mid;
    		if(nums[start]<=nums[mid]){
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
    	return -1;
    }
}