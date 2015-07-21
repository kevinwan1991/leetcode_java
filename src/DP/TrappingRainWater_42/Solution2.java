package DP.TrappingRainWater_42;

public class Solution2 {
    public int trap(int[] height) {
    	if(height==null || height.length==0)
    		return 0;
    	
    	int[] leftTall=new int[height.length];
    	leftTall[0]=0;
    	for(int i=1; i<height.length; i++)
    		leftTall[i]=Math.max(leftTall[i-1],height[i-1]);
    	
    	int[] rightTall=new int[height.length];
    	rightTall[height.length-1]=0;
    	for(int i=height.length-2; i>=0; i--)
    		rightTall[i]=Math.max(rightTall[i+1], height[i+1]);
    	
    	int sum=0;
    	for(int i=1; i<height.length-1; i++){
    		int unit=Math.min(rightTall[i], leftTall[i])-height[i];
    		unit=unit>0?unit:0;
    		sum+=unit;
    	}
    	
    	return sum;
    }
}