package Bitwise.NumOf1Bits_191;

public class Solution {
  
	//You need to treat n as an unsigned integer!
    public int hammingWeight(int n) {
        int num=0;
        //i can't use >0 or <0 as 100000..1 is less than 0,as we have to use like a signed integer:
        while(n!=0){
        	n=n&(n-1);
        	//for every number, even negative,n&(n-1)will kill 1 possible 1 at tail! 
        	num++;
        }
        return num;
    }
    
    //move bit and compare with 1:
    public int hammingWeight1(int n){
    	int count=0;
    	for(int i=0; i<32; i++)
    		count+=(n>>i)&1;
    	return count;
    }
    
    public static void main(String[] args){
    	int x=-2147483648;
    	new Solution().hammingWeight(x);
    }
}
