package Bitwise.SingleNumber_137;

public class Solution2 {
	//Maintain bits that appeared once and twice;
	//Every time a bit appeared 3times, it will be removed;
	//But if it appeared again, a 4th time, it can be maintained.
    public int singleNumber(int[] nums) {
        int ones,twos,three_rev;
        ones=0;
        twos=0;
        for(int num:nums){
        	twos|=(ones&num);
        	ones^=num;
        	
        	three_rev=~(ones&twos);
        	ones&=three_rev;
        	twos&=three_rev;
        }
        return ones;
    }
    //Detailed explanation: http://www.geeksforgeeks.org/find-the-element-that-appears-once/
}