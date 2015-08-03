package DP.DistinctSubsequence_115;

public class Solution2 {
    public int numDistinct(String s, String t) {
        if(s.length()<t.length())
        	return 0;
        
        int[][] DP=new int[t.length()+1][s.length()+1];
        for(int j=0; j<=s.length(); j++)
        	DP[0][j]=1;
        for(int i=1; i<=t.length(); i++){
        	for(int j=i; j<=s.length(); j++){
        		if(t.charAt(i-1)==s.charAt(j-1))
        			DP[i][j]=DP[i][j-1]+DP[i-1][j-1];
        		else
        			DP[i][j]=DP[i][j-1];
        	}
        }
        return DP[t.length()][s.length()];
    }
}