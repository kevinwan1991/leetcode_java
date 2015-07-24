package TwoPointers.ThreeSumCloset_16;

import java.util.Arrays;

// Two pointers: from 2 sides!
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int result=0;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
        	int j=i+1;
        	int k=nums.length-1;
        	
        	while(j<k){
        		int tmpSum=nums[i]+nums[j]+nums[k];
        		if(Math.abs(target-tmpSum)<min){
        			result=tmpSum;
        			min=Math.abs(target-tmpSum);
        		}
        		if(tmpSum<target)
        			j++;
        		else
        			k--;
        	}
        }
        return result;
    }
}