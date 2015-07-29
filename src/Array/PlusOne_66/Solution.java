package Array.PlusOne_66;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int i=digits.length-1;
    	digits[digits.length-1]++;
    	while(digits[i]>=10 && i>=0){
    		if(i>0){
    			digits[i]-=10;
    			digits[--i]++;
    		}else if(i==0 && digits[0]==10){
    			int[] res=new int[digits.length+1];
        		System.arraycopy(digits,1,res,2,digits.length-1);
        		res[1]=0;
        		res[0]=1;
        		return res;
    		}
    	}
    	return digits;
    }
}