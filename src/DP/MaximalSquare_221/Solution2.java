package DP.MaximalSquare_221;

public class Solution2 {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        	return 0;
        
        //DP[][] the max size square which takes i,j as right,bottom vertex:
        int[][] dp=new int[matrix.length][matrix[0].length];
        
        for(int i=0; i<matrix.length; i++)
        	dp[i][0]=Character.getNumericValue(matrix[i][0]);
        for(int i=0; i<matrix[0].length; i++)
        	dp[0][i]=Character.getNumericValue(matrix[0][i]);
        
        for(int i=1; i<matrix.length; i++){
        	for(int j=1; j<matrix[0].length; j++){
        		if(matrix[i][j]=='1'){
        			int min=Math.min(dp[i-1][j],dp[i][j-1]);
            		dp[i][j]=Math.min(min, dp[i-1][j-1])+1;
        		}
        	}
        }
        
        int max=0;
        for(int i=0; i<matrix.length; i++)
        	for(int j=0; j<matrix[0].length; j++)
        		max=Math.max(max,dp[i][j]);
        return max*max;
    }
}