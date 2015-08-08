package Math.HappyNumber_202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
    	if(n<0)
    		return false;
    	
    	HashSet<Integer> set=new HashSet<Integer>();
    	int tmp=n;
    	while(tmp!=1){
    		if(set.contains(tmp))
    			return false;
    		else{
    			set.add(tmp);
    			tmp=squareSum(tmp);
    		}
    	}
    	return true;
    }
    
    public int squareSum(int n){
    	if(n<0)
    		return -1;
    	
    	int res=0;
    	while(n>0){
    		int digit=n%10;
    		res+=(digit*digit);
    		n=n/10;
    	}
    	return res;
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	s.isHappy(2);
    }
}
