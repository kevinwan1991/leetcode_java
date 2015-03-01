package Filling_Algorithm;

public class FloodFill {
	public static void floodFillUtil(int[][] screen, int x, int y, int preC, int curC){
		int width=screen[0].length;
		int lenth=screen.length;
		if(x<0 || x>=width || y<0 || y>=lenth)
			return;
		if(screen[x][y]!=preC)
			return;
		screen[x][y]=curC;
		floodFillUtil(screen,x-1,y,preC,curC);
		floodFillUtil(screen,x+1,y,preC,curC);
		floodFillUtil(screen,x,y-1,preC,curC);
		floodFillUtil(screen,x,y+1,preC,curC);
	}
	
	public static void floodFill(int[][] screen, int x, int y, int curC){
		int preC=screen[x][y];
		floodFillUtil(screen,x,y,preC,curC);
	}
}
