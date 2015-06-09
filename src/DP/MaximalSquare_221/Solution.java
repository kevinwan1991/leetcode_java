package DP.MaximalSquare_221;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        //Use another matrix to store the 'valuable value':the size of square before the pixel
    	if(matrix==null || matrix.length==0 || matrix[0].length==0)
    		return 0;
    	
    	//Pre_process the matrix:
    	int[][] res = new int[matrix.length][matrix[0].length];
    	
    	for(int i=0; i<matrix.length; i++)
    		res[i][0]=Character.getNumericValue(matrix[i][0]);
    	
    	for(int j=0; j<matrix[0].length; j++)
    		res[0][j]=Character.getNumericValue(matrix[0][j]);
    	
    	
    	//Process: based on: t[i][j] = min(t[i][j-1], t[i-1][j], t[i-1][j-1]) + 1 
    	for(int i=1; i<matrix.length; i++){
    		for(int j=1; j<matrix[0].length; j++){
    			if(matrix[i][j]=='1'){
    				int min=Math.min(res[i][j-1], res[i-1][j]);
    				min=Math.min(min, res[i-1][j-1]);
    				res[i][j]=min+1;
    			}
    		}
    	}
    	
    	int max=0;
    	for(int i=0; i<res.length; i++){
    		for(int j=0; j<res[0].length; j++)
    			max=Math.max(res[i][j], max);
    	}
        
    	return max*max;
    }
}