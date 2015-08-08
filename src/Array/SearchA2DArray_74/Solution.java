package Array.SearchA2DArray_74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix==null || matrix.length==0 || matrix[0].length==0)
    		return false;
    	
    	for(int i=0; i<matrix.length; i++){
    		if((i<matrix.length-1 && target>=matrix[i][0] && target<matrix[i+1][0])
    				|| (i==matrix.length-1)){
    			for(int j=0; j<matrix[0].length; j++){
    				if(target==matrix[i][j])
    					return true;
    			}
    		}
    	}
    	return false;
    }
}