package Filling_Algorithm;

public class BoundaryFill {
	public static void boundFillUtil(int[][] screen, int x, int y, int boundC, int curC){
		int width=screen[0].length;
		int lenth=screen.length;
		if(x<0 || x>=width || y<0 || y>=lenth)
			return;
		//screen[x][y]==curC make sure that area has been re-painted will not be paint again:
		if(screen[x][y]==boundC || screen[x][y]==curC)
			return;
		
		screen[x][y]=curC;
		boundFillUtil(screen,x-1,y,boundC,curC);
		boundFillUtil(screen,x+1,y,boundC,curC);
		boundFillUtil(screen,x,y-1,boundC,curC);
		boundFillUtil(screen,x,y+1,boundC,curC);
	}
	
	public static void boundFill(int[][] screen, int x, int y, int boundC, int curC){
		boundFillUtil(screen,x,y,boundC,curC);
	}
}
