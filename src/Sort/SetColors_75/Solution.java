package Sort.SetColors_75;

public class Solution {
    public void sortColors(int[] nums) {
    	if(nums==null || nums.length<2)
    		return;
    	
    	int[] color=new int[3];
    	for(int i=0; i<nums.length; i++)
    		color[nums[i]]++;
    	
    	for(int i=0; i<2; i++)
    		color[i+1]=color[i]+color[i+1];
    	
    	int i=0;
    	while(i<nums.length){
    		if(i<=color[0]-1)
    			nums[i]=0;
    		else if(i<=(color[1]-1) && i>color[0]-1)
    			nums[i]=1;
    		else
    			nums[i]=2;
    		i++;
    	}
    }
}