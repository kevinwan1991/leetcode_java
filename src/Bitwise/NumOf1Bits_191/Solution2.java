package Bitwise.NumOf1Bits_191;

public class Solution2 {
	   public int hammingWeight(int n){
		   int count=0;
		   for(int i=0; i<32; i++){
			   int tmp=(n>>i)&1;
		   	   if(tmp==1)
		   		   count++;
		   }
		   return count;
	   }
}	  
