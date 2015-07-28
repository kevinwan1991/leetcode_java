package Bitwise.BitwiseAndOfNumbersRange_201;

public class Solution {
	// 11100001
	// 11111111
	// 111.....will all be 0;
	// As they are looking for the common head!
	// n&n-1 = either n-1 or n-2
    public int rangeBitwiseAnd(int m, int n) {
    	int steps=0;
    	while(m!=n){
    		m>>=1;
    		n>>=1;
    		steps++;
    	}
    	return m<<steps;
    }
}
