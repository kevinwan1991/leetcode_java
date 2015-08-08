package Math.PalindromeNumber_9;

public class Solution {
    public boolean isPalindrome(int x) {
    	if(x<0)
    		return false;
    	
    	int numOfDigit=0;
    	int tmp=x;
    	while(tmp>0){
    		numOfDigit+=1;
    		tmp/=10;
    	}
    	
    	int i=0;
    	int j=numOfDigit-1;
    	int tmp1=x,tmp2=x;
    	while(i<=j){
    		int tail=tmp1%10;
    		tmp1/=10;
    		
    		int head=(int)(tmp2/(Math.pow(10,j)));
    		tmp2-=head*(Math.pow(10,j));
    		
    		if(tail!=head)
    			return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}