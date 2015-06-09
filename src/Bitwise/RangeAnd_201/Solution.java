package Bitwise.RangeAnd_201;

public class Solution {
	//The common prefix of M and N, do more analysis before searching:
    public int rangeBitwiseAnd(int m, int n) {
    	if(m>n)
    		return 0;
    	
        int count=0;
        while(m!=0&&m!=n){
        	m=m>>1;
        	n=n>>1;
        	count++;
        }
        return m<<count;
    }
}