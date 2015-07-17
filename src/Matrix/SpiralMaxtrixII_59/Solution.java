package Matrix.SpiralMaxtrixII_59;

public class Solution {
    public int[][] generateMatrix(int n) {
    	if(n<=0)
    		return new int[0][0];
    	if(n==1)
    		return new int[][]{{1}};
    	
    	int num=1;
    	int[][] res=new int[n][n];
    	for(int size=n; size>=2; size-=2){
    		int topLeftX=0+(n-size)/2;
    		int topLeftY=0+(n-size)/2;
    		int topRightX=topLeftX+size-1;
    		int topRightY=topLeftY;
    		int downLeftX=topLeftX;
    		int downLeftY=topLeftY+size-1;
    		int downRightX=topRightX;
    		int downRightY=topRightY+size-1;
    		for(int i=topLeftX; i<=topRightX; i++)
    			res[topLeftY][i]=num++;
    		for(int i=topRightY+1;i<=downRightY; i++)
    			res[i][topRightX]=num++;
    		for(int i=downRightX-1;i>=downLeftX;i--)
    			res[downRightY][i]=num++;
    		for(int i=downLeftY-1; i>=topLeftY+1; i--)
    			res[i][downLeftX]=num++;
    	}
    	if(n%2==1)
    		res[n/2][n/2]=num;
    	return res;
    }
}