package DP.UniqueBinarySearchTrees_96;

public class Solution {
	// n with n-1,n-2...,use the conclusion of n-1!!!
	// so we take n-1 as a whole, don't cut it off!!!
	// discuss on different cases!!!!!
    public int numTrees(int n) {
    	if(n==0 || n==1)
    		return 1;
    	int[] count=new int[n+1];
    	count[0]=1;
    	count[1]=1;
    	
    	for(int i=2; i<=n; i++){
    		for(int left=0; left<=i-1; left++)
    			count[i]+=(count[left]*count[i-left-1]);
    	}
    	return count[n];
    }
}