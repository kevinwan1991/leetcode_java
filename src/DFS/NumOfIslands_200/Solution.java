package DFS.NumOfIslands_200;

public class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null ||grid.length==0 ||grid[0].length==0)
        	return 0;
        
        int num=0;
        for(int i=0; i<grid.length; i++){
        	for(int j=0; j<grid[0].length; j++){
        		if(grid[i][j]=='1'){
        			num++;
        			dfs(grid,i,j);
        		}
        	}
        }
        return num;
    }
    
    public void dfs(char[][] grid,int x,int y){
    	grid[x][y]='0';
    	
    	if(x-1>=0 && grid[x-1][y]=='1'){
    		grid[x-1][y]='0';
    		dfs(grid,x-1,y);
    	}
    	
    	if(x+1<grid.length && grid[x+1][y]=='1'){
    		grid[x+1][y]='0';
    		dfs(grid,x+1,y);
    	}
    		
    	if(y-1>=0 && grid[x][y-1]=='1'){
    		grid[x][y-1]='0';
    		dfs(grid,x,y-1);
    	}
    		
    	if(y+1<grid[0].length && grid[x][y+1]=='1'){
    		grid[x][y+1]='0';
    		dfs(grid,x,y+1);
    	}
    }
}