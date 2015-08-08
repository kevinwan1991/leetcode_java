package Math.PowerOfTwo_231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n<=0)
    		return false;
    	else if(n<1){
    		int tmp=1;
    		while(tmp>n){
    			tmp=tmp/2;
    			if(tmp==n)
    				return true;
    		}
    		return false;
    	}else{
    		while(n>1){
    			if(n%2==1)
    				return false;
    			n=n/2;
    		}
    	}
    	return true;
    }
}