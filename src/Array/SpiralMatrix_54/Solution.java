package Array.SpiralMatrix_54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	if(matrix==null || matrix.length==0 || matrix[0].length==0)
    		return new ArrayList<Integer>();
    	
    	int lenth=matrix[0].length;
    	int width=matrix.length;
    	
    	int stRow=0;
    	int stCol=0;
    	List<Integer> resList=new ArrayList<Integer>();
    	while(lenth>1 && width>1){
    		for(int i=stCol; i<stCol+lenth-1; i++)
    			resList.add(matrix[stRow][i]);
    		for(int j=stRow; j<stRow+width-1; j++)
    			resList.add(matrix[j][stCol+lenth-1]);
    		for(int i=stCol+lenth-1; i>stCol; i--)
    			resList.add(matrix[stRow+width-1][i]);
    		for(int j=stRow+width-1; j>stRow; j--)
    			resList.add(matrix[j][stCol]);
    		lenth-=2;
    		width-=2;
    		stRow++;
    		stCol++;
    	}
    	
    	if(lenth==1 && width==1)
    		resList.add(matrix[stRow][stCol]);
    	else if(lenth==1 && width!=1){
    		for(int j=stRow; j<stRow+width; j++)
    			resList.add(matrix[j][stCol]);
    	}else if(lenth!=1 && width==1){
    		for(int i=stCol; i<stCol+lenth; i++)
    			resList.add(matrix[stRow][i]);
    	}
    	
    	return resList;
    }
}