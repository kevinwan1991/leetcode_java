package BackTracking.NQueens_51;

import java.util.ArrayList;
import java.util.List;


// How to hold chess-board info!!!!!
// 1D array is a creation!!!!
public class Solution {
    public List<List<String>> solveNQueens(int n) {
    	List<List<String>> resList=new ArrayList<List<String>>();
    	if(n==0)
    		return resList;
    	
    	int[] chess=new int[n];
    	//Arrays.fill(chess,-1);
    	
    	helper(resList,n,chess,0);
    	return resList;
    }
    
    public void helper(List<List<String>> resList, int maxRow, int[] chess, int row){
    	if(row>=maxRow){
    		List<String> tmpList=new ArrayList<String>();
    		for(int i=0; i<chess.length; i++){
    			StringBuilder sb=new StringBuilder();
    			for(int j=0; j<chess.length; j++){
    				if(j==chess[i])
    					sb.append("Q");
    				else
    					sb.append(".");
    			}
    			tmpList.add(sb.toString());
    		}
    		resList.add(new ArrayList<String>(tmpList));
    		return;
    	}
    	
		for(int i=0; i<maxRow; i++){
			if(isValid(chess,row,i)){
				chess[row]=i;
				helper(resList,maxRow,chess,row+1);
				chess[row]=-1;
			}
		}
    }
    
    public boolean isValid(int[] chess, int row, int col){
    	for(int i=0; i<row; i++){//where to stop!!!
    		if(col==chess[i] || Math.abs(i-row)==Math.abs(chess[i]-col))
    			return false;
    	}
    	return true;
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	s.solveNQueens(4);
    }
}