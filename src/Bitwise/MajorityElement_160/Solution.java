package Bitwise.MajorityElement_160;

public class Solution {
    public int majorityElement(int[] nums) {
    	int[] bits=new int[32];
    	int res=0;
    	for(int i=0; i<32; i++){
    		for(int num:nums)
    			bits[i]+=(num>>i)&1;
    		bits[i]=(bits[i]>(nums.length/2))?1:0;
    		res|=(bits[i]<<i);
    	}
    	return res;
    }
}