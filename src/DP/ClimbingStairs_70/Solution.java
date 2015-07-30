package DP.ClimbingStairs_70;

public class Solution {
    public int climbStairs(int n) {
    	if(n==0 || n==1)
    		return 1;
    	
    	int[] disWay=new int[n+1];
    	disWay[0]=1;
    	disWay[1]=1;
    	
    	for(int i=2;i<=n;i++)
    		disWay[i]=disWay[i-1]+disWay[i-2];
    	return disWay[n];
    }
}