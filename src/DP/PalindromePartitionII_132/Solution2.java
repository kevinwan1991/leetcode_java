package DP.PalindromePartitionII_132;

public class Solution2 {
    public int minCut(String s) {
    	if(s==null || s.length()==0)
    		return 0;
    	
    	boolean[][] dp=new boolean[s.length()][s.length()];
    	int[] cuts=new int[s.length()];
    	// cuts[i] head to i part, how many partition!
    	
    	for(int j=0; j<s.length(); j++){
    		cuts[j]=j;
    		for(int i=0; i<=j; i++){
    			if(s.charAt(i)==s.charAt(j) &&(j-i<=1 || dp[i+1][j-1])){
    				dp[i][j]=true;
    				if(i>0)
    					cuts[j]=Math.min(cuts[j],cuts[i-1]+1);
    				else
    					cuts[j]=0;
    			}
    		}
    	}
    	return cuts[s.length()-1];
    }
}