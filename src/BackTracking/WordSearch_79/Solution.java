package BackTracking.WordSearch_79;

public class Solution {
    public boolean exist(char[][] board, String word) {
    	if(board==null || board[0].length==0)
    		return false;
    	
    	boolean[][] ifChecked=new boolean[board.length][board[0].length];
    	
    	for(int i=0; i<board.length; i++){
    		for(int j=0; j<board[0].length; j++){
    			if(word.charAt(0)==board[i][j]){
    				ifChecked[i][j]=true;
    				if(helper(board,ifChecked,word.substring(1),i,j))
    					return true;
    				ifChecked[i][j]=false;
    			}
    		}
    	}
    	return false;
    }
    
    public boolean helper(char[][] board, boolean[][] ifChecked, String word, int row, int col){
    	if(word.equals(""))
    		return true;
    	
    	if(row>0 && !ifChecked[row-1][col] && board[row-1][col]==word.charAt(0)){
    		ifChecked[row-1][col]=true;
    		if(helper(board,ifChecked,word.substring(1),row-1,col))
    			return true;
    		ifChecked[row-1][col]=false;
    	}
    	
    	if(col>0 && !ifChecked[row][col-1] && board[row][col-1]==word.charAt(0)){
    		ifChecked[row][col-1]=true;
    		if(helper(board,ifChecked,word.substring(1),row,col-1))
    			return true;
    		ifChecked[row][col-1]=false;
    	}
    	
    	if(row<board.length-1 && !ifChecked[row+1][col] && board[row+1][col]==word.charAt(0)){
    		ifChecked[row+1][col]=true;
    		if(helper(board,ifChecked,word.substring(1),row+1,col))
    			return true;
    		ifChecked[row+1][col]=false;
    	}
    	
    	if(col<board[0].length-1 && !ifChecked[row][col+1] && board[row][col+1]==word.charAt(0)){
    		ifChecked[row][col+1]=true;
    		if(helper(board,ifChecked,word.substring(1),row,col+1))
    			return true;
    		ifChecked[row][col+1]=false;
    	}
    	return false;
    }
}