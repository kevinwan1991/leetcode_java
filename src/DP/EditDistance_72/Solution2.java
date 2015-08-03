package DP.EditDistance_72;

public class Solution2 {
    public int minDistance(String word1, String word2) {
    	int[][] DP=new int[word1.length()+1][word2.length()+1];
    	for(int i=0; i<=word1.length(); i++)
    		DP[i][0]=i;
    		
    	for(int j=0; j<=word2.length(); j++)
    		DP[0][j]=j;
    	
    	for(int i=1; i<=word1.length(); i++){
    		for(int j=1; j<=word2.length(); j++){
    			if(word1.charAt(i-1)==word2.charAt(j-1))
    				DP[i][j]=DP[i-1][j-1];
    			else{
    				int min=Math.min(DP[i-1][j]+1, DP[i][j-1]+1);
    				DP[i][j]=Math.min(min, DP[i-1][j-1]+1);
    			}
    		}
    	}
    	return DP[word1.length()][word2.length()];
    }
}					 