package DP.DistinctSubsequence_115;

public class Solution {
    public int numDistinct(String s, String t) {
        if(s.length()<t.length())
        	return 0;
        
        int[][] numDis=new int[s.length()+1][t.length()+1];//+1 for no elements
        for(int i=0; i<=s.length(); i++)
        	numDis[i][0]=1;
        
        for(int i=1; i<=s.length(); i++){
        	for(int j=1; j<=t.length(); j++){
        		//i correspond to i-1 in string!
        		if(s.charAt(i-1)==t.charAt(j-1))
        			//if not use the s.i, numDis[i-1][j];
        			//if use the s.i, numDis[i-1][j-1]
        			numDis[i][j]=numDis[i-1][j-1]+numDis[i-1][j];
        		else
        			numDis[i][j]=numDis[i-1][j];
        	}
        }
        return numDis[s.length()][t.length()];
    }
}