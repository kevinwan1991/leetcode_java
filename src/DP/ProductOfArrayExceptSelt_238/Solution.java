package DP.ProductOfArrayExceptSelt_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	int[] resList=new int[nums.length];
    	resList[nums.length-1]=1;
    	//from right
    	for(int i=resList.length-2; i>=0; i--)
    		resList[i]=nums[i+1]*resList[i+1];
    	
    	//from left
    	int left=1;
    	for(int i=0; i<resList.length; i++){
    		resList[i]*=left;
    		left*=nums[i];
    	}
    	return resList;
    }
}