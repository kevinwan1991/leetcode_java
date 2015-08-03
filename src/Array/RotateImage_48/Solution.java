package Array.RotateImage_48;

public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        	return;
        
        int len=matrix.length;
        for(int i=0; i<=(len-1)/2; i++){
        	for(int j=i; j<len-i-1; j++){
        		int tmp=matrix[i][j];
        		matrix[i][j]=matrix[len-1-j][i];
        		matrix[len-1-j][i]=matrix[len-1-i][len-1-j];
        		matrix[len-1-i][len-1-j]=matrix[j][len-1-i];
        		matrix[j][len-1-i]=tmp;
        	}
        }
    }
    //similar to spiral matrix, take [0...n-2],n-1 and rotate!
    //watch out for half the length!
}