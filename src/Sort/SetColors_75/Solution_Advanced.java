package Sort.SetColors_75;

public class Solution_Advanced {
    public void sortColors(int[] nums) {
    	if(nums==null || nums.length<2)
    		return;
    	
    	int[] color=new int[3];
    	for(int i=0; i<nums.length; i++)
    		color[nums[i]]++;
    	
    	// No accumulating anymore!!!!!
    	
    	// Use another way to loop: as color goes from 0 to 2!
    	int i=0;
    	int colPt=0;
    	while(colPt<color.length){
    		if(color[colPt]!=0){
    			nums[i++]=colPt;
    			color[colPt]--;
    		}else
    			colPt++;
    	}
    }
}
