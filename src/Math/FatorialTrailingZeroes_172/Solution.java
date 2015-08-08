package Math.FatorialTrailingZeroes_172;

public class Solution {
    public int trailingZeroes(int n) {
    	if(n<0)
    		return 0;
    	if(n==0)
    		return 1;
    	
    	int counter5=0; //factorCounter(2,n);
    	for(long i=5; n/i>1; i*=5)//if n=Integer.max, i may go beyond int!!!!!!!
    		counter5+=n/i;
    	
    	return counter5;
    }
    
    // Not smart!
    public int factorCounter(int factor,int n){
    	int counter=0;
    	int degree=0;
    	int tmp=0;
    	while(tmp<n){
    		tmp+=factor;
    		if(tmp>=Math.pow(factor, degree))
    			degree++;
    		
    		counter+=degree;
    	}
    	return counter;
    }
}
