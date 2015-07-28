package Array.SpiralMatrixII_59;

public class Solution {
    public int[][] generateMatrix(int n) {
    	if(n<0)
    		return null;
    	
    	int lenth=n;
    	int width=n;
    	
    	int stRow=0;
    	int stCol=0;
    	
    	int count=1;
    	int[][] matrix=new int[n][n];

    	while(lenth>0 && width>0){
    		if(lenth==1 && width==1)
    			matrix[stRow][stCol]=count++;
    		for(int i=stCol; i<stCol+lenth-1; i++)
    			matrix[stRow][i]=count++;
    		for(int j=stRow; j<stRow+width-1; j++)
    			matrix[j][stCol+lenth-1]=count++;
    		for(int i=stCol+lenth-1; i>stCol; i--)
    			matrix[stRow+width-1][i]=count++;
    		for(int j=stRow+width-1; j>stRow; j--)
    			matrix[j][stCol]=count++;
    		lenth-=2;
    		width-=2;
    		stRow++;
    		stCol++;
    	}
    	return matrix;
    }
}
