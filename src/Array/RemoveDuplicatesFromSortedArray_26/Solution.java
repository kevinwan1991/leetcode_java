package Array.RemoveDuplicatesFromSortedArray_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        
        int len=1;
        int index=0;
        for(int i=1; i<nums.length; i++){
        	if(nums[i]!=nums[i-1]){
        		len++;
        		nums[++index]=nums[i];//consider different not common elements!!!
        	}
        }
        return len;
    }
}