package BackTracking.SudokuSolver_37;

public class Solution {
    public void solveSudoku(char[][] board) {
    	if(board==null || board.length==0)
    		return;
    	
    	helper(board);
    }
    
    public boolean helper(char[][] board){
    	for(int row=0; row<board.length; row++){
    		for(int col=0; col<board[0].length; col++){
    			if(board[row][col]=='.'){
    				for(char num='1'; num<='9'; num++){
    					if(isValid(board,num,row,col)){
	    					board[row][col]=num;
	    					if(helper(board))
	    						return true;
	    					else
	    						board[row][col]='.';
    					}
    				}
    				return false; // Here is a stopping point!!!
    			}
    		}
    	}
    	return true;
    }
    
    public boolean isValid(char[][] board,char num,int row,int col){
    	for(int i=0; i<board.length; i++)
    		if(board[i][col]==num)
    			return false;
    	for(int j=0; j<board[0].length; j++)
    		if(board[row][j]==num)
    			return false;
    	for(int i=(row/3)*3; i<(row/3)*3+3; i++)
    		for(int j=(col/3)*3; j<(col/3)*3+3; j++)
    			if(board[i][j]==num)
    				return false;
    	return true;
    }
}