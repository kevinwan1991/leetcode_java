package TwoPointers.ContainerWithMostWater_11;

public class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length<2)
        	return 0;
        
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
        	int area=Math.min(height[left],height[right])*(right-left);
        	max=Math.max(max, area);
        	if(height[left]>height[right])
        		right--;
        	else
        		left++;
        }
        return max;
    }
}