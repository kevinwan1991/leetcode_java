package Bitwise.MajorityElement_160;

public class Solution2 {
	// Linear time Majority Vote Algorithm:
    public int majorityElement(int[] nums) {
    	int count=0;
    	int res=0;
    	for(int i=0; i<nums.length; i++){
    		if(count==0){
    			res=nums[i];
    			count=1;
    		}else if(res==nums[i]){
    			count++;
    		}else{
    			count--;
    		}
    	}
    	return res;
    }
}   