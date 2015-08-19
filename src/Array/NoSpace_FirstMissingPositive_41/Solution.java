package Array.NoSpace_FirstMissingPositive_41;

// Easiest way: sort and traverse: O(n*lg(n))
// No sorting: hashMap, from 1...n check if in the map;
// No extra space: use array space, nums[i]=x, put x to nums[x-1], then loop the array!!
public class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums==null || nums.length==0)
            return 1;
        
        for(int i=0; i<nums.length; i++){
            int pt=nums[i];
            while(pt>=1 && pt<=nums.length && nums[pt-1]!=pt){
                int tmp=nums[pt-1];
                nums[pt-1]=pt;
                
                pt=tmp;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
    }
}