package DP.EditDistance_72;

public class Solution {
    public int minDistance(String word1, String word2) {
    	int len1=word1.length();
    	int len2=word2.length();
    	
    	int[][] dp=new int[len1+1][len2+1];
    	for(int i=0; i<=len1; i++)
    		dp[i][0]=i;
    	for(int j=0; j<=len2; j++)
    		dp[0][j]=j;
    	
    	for(int i=0; i<len1; i++){
    		for(int j=0; j<len2; j++){
    			if(word1.charAt(i)==word2.charAt(j))
    				dp[i+1][j+1]=dp[i][j];
    			else{
    				int replace=dp[i][j]+1;
    				int delete=dp[i+1][j]+1;
    				int add=dp[i][j+1]+1;
    				
    				int min=Math.min(replace, delete);
    				min=Math.min(min, add);
    				dp[i+1][j+1]=min;
    			}
    		}
    	}
    	
    	return dp[len1][len2];
    }
} 