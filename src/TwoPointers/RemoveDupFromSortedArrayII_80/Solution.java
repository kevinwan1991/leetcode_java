package TwoPointers.RemoveDupFromSortedArrayII_80;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
        
        int count=1, total=1;
        int realPt=1, curPt=1;
        while(curPt<nums.length && realPt<nums.length){
        	if(nums[curPt]!=nums[curPt-1]){
        		count=1;
        	}else{
        		count++;
        	}
        	if(count<=2){
        		nums[realPt++]=nums[curPt++];
        		total++;
        	}else
        		curPt++;
        }
        return total;
    }
}