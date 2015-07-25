package Bitwise.SingleNumber_137;

public class Solution {
	// Bit manipulation: if cann't find optimistic ways, we may try figure out every bit!!!
    public int singleNumber(int[] nums) {
        int res=0;
        int[] bits=new int[32];
        for(int i=0; i<32; i++){
        	for(int j=0; j<nums.length; j++){
        		int tmp=(nums[j]>>i)&1;
        		bits[i]=(bits[i]+tmp)%3;
        	}
        	res|=(bits[i]<<i);
        }
        return res;
    }
}