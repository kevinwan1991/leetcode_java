package Bitwise.SingleNumber_136;

//No extra memory: don't treat them as array of numbers!!!!
public class Solution {
    public int singleNumber(int[] nums) {
    	int res=0;
    	for(int num:nums)
    		res=res^num;
    	return res;
    }
}