package DP.TrappingRainWater_42;

public class Solution {
    public int trap(int[] height) {
    	if(height==null || height.length==0)
    		return 0;
    	
    	int[] leftTall=new int[height.length];
    	leftTall[0]=height[0];
    	for(int i=1; i<height.length; i++)
    		leftTall[i]=Math.max(leftTall[i-1], height[i]);
    	
    	int[] rightTall=new int[height.length];
    	rightTall[height.length-1]=height[height.length-1];
    	for(int i=height.length-2; i>=0; i--)
    		rightTall[i]=Math.max(rightTall[i+1], height[i]);
    	
    	//--------------------------------------------------
    	int sum=0;
    	for(int i=0; i<height.length; i++)
    		sum+=(Math.min(leftTall[i], rightTall[i])-height[i]);
    	return sum;
    }
}