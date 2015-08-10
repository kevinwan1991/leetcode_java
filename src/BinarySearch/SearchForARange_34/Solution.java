package BinarySearch.SearchForARange_34;

public class Solution {
    public int[] searchRange(int[] nums,int target) {
        if(nums==null || nums.length==0)
        	return null;
        
        int pt1=0,pt2=nums.length-1;
        
        while(pt1<=pt2){
        	if(pt1==pt2 && nums[pt1]!=target)
        		return new int[]{-1,-1};
        	else if(pt1==pt2 && nums[pt1]==target){
        		int i=pt1;
        		while(i>=0 && nums[i]==target)
        			i--;
        		int j=pt2;
        		while(j<nums.length && nums[j]==target)
        			j++;
        		return new int[]{i+1,j-1};
        	}else{
        		int mid=(pt1+pt2)/2;
        		if(target==nums[mid]){
        			pt1=pt2=mid;
        		}else if(target<nums[mid])
        			pt2=mid-1;
        		else
        			pt1=mid+1;
        	}
        }
        return new int[]{-1,-1};
    }
}