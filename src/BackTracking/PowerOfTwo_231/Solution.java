package BackTracking.PowerOfTwo_231;

// Single number operation, no need to iterate!!!
// We don't consider if 2 to the degree of -1, say 0.5 case:
public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n<=0)
    		return false;
    	if(n>=1 && (n&(n-1))==0)
    		return true;
    	return false;
    }
}
