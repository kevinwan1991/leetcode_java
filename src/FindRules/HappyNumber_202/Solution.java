package FindRules.HappyNumber_202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        while(!set.contains(n)){
        	set.add(n);
        	n=getSquareSum(getDigits(n));
        	if(n==1)
        		return true;
        }
        return false;
    }
    
    public int getSquareSum(int[] list){
    	int sum=0;
    	for(int i=0; i<list.length; i++)
    		sum+=(list[i]*list[i]);
    	return sum;
    }
    
    public int[] getDigits(int num){
    	String s=String.valueOf(num);
    	int[] res=new int[s.length()];
    	for(int i=0; i<s.length(); i++){
    		res[i]=num%10;
    		num/=10;
    	}
    	return res;
    }
}