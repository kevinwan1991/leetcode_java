package BFS.SurroundedRegions_130;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	private Queue<Integer> queue=new LinkedList<Integer>();
    public void solve(char[][] board) {
        if(board==null || board.length==0 || board[0].length==0)
        	return;
      
        for(int i=0; i<board.length; i++){
        	if(board[i][0]=='O')
        		bfs(board,i,0);
        	if(board[i][board[0].length-1]=='O')
        		bfs(board,i,board[0].length-1);
        }
        for(int j=0; j<board[0].length; j++){
        	if(board[0][j]=='O')
        		bfs(board,0,j);
        	if(board[board.length-1][j]=='O')
        		bfs(board,board.length-1,j);
        }
        
        for(int i=0; i<board.length; i++){
        	for(int j=0; j<board[0].length; j++){
        		if(board[i][j]=='#')
        			board[i][j]='O';
        		else if(board[i][j]=='O')
        			board[i][j]='X';
        	}
        }
    }
    
   //BFS:
    public void bfs(char[][] board, int x, int y){
    	helper(board,x,y);
    	
    	while(!queue.isEmpty()){
    		int position=queue.poll();
    		x=position/board[0].length;
    		y=position%board[0].length;
    		
    		helper(board,x-1,y);
    		helper(board,x+1,y);
    		helper(board,x,y+1);
    		helper(board,x,y-1);	
    	}
    }
    
    public void helper(char[][] board, int x, int y){
    	if(x<0 || y<0 || x>board.length-1 || y>board[0].length-1)
    		return;
    	
    	if(board[x][y]!='O')
    		return;
    	
    	board[x][y]='#';
    	queue.offer(x*board[0].length+y);
    }
    
    //Four D recursion will kill the stack!
    public void DFS(char[][] board, int x, int y){
    	if(x<0 || y<0 || x>board.length-1 || y>board[0].length-1)
    		return;
    	
    	if(board[x][y]!='O')
    		return;
    	
    	board[x][y]='#';
    
		helper(board,x-1,y);
		helper(board,x+1,y);
		helper(board,x,y+1);
		helper(board,x,y-1);
    }
}