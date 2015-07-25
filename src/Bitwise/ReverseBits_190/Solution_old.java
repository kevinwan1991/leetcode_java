package Bitwise.ReverseBits_190;

public class Solution_old {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        int tmp;
        for(int i=0; i<32; i++){
        	tmp=n&1;
        	n=n>>1;
        	res=res<<1;//cannot res|=tmp then res<<1,as the res will be enlarged by 2 times finally!
        	res=res|tmp;
        }
        return res;
    }
    
    // swap alternative:
    public int reverseBits1(int n){
    	for(int i=0; i<16; i++)
    		n=swap(n,i,32-i-1);
    	return n;
    }
    public int swap(int n,int i,int j){
    	int x=(n>>i)&1;
    	int y=(n>>j)&1;
    	if((x^y)!=0)
    		n^=(1<<i)|(1<<j);
    	return n;
    }
}