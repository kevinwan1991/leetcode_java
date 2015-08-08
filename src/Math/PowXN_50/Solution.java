package Math.PowXN_50;

public class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        	return 1;
    	if(n<0)
    		return (double)(1)/((pow(x,-(n+1))*x));// if N=-2147483648,+1 and then get it back!!
    	else
    		return pow(x,n);
    }
    
    // n must be positive:
    public double pow(double x, int n){
    	if(n==1)             //  if u want use it, make sure n!=-2147483648
    		return x;	     //  however n=-1, it will be 0 when passed
    						 //  so x==0 case is a must!!!
    	
    	if(x==0)//n=-2147483648, won't change after *(-1), so n eventually become -1,and then 0
    		return 1;
    	
    	double squareRoot=pow(x,n/2);
    	
    	double res=squareRoot*squareRoot;
    	if(n%2==1)
    		res*=x;
    	
    	return res;
    }
    
    public static void main(String[] args){
    	int x=Integer.MIN_VALUE;
    	Solution s=new Solution();
    	s.myPow(-1, -2147483648);
    	System.out.print(x);
    }
}