package LinkedList.RemoveElement_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0)
        	return 0;
        
        int actEnd,truEnd;
        actEnd=0;
        truEnd=0;
        while(truEnd<nums.length){
        	if(nums[truEnd]!=val){
        		nums[actEnd++]=nums[truEnd];
        	}
        	truEnd++;
        }
        return actEnd;
    }
}