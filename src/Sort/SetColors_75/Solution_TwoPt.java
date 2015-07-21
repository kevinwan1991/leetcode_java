package Sort.SetColors_75;

public class Solution_TwoPt {
	public void sortColors(int[] nums) {
    	if(nums==null || nums.length<2)
    		return;
    	
    	int redPt=0;
    	int bluPt=nums.length-1;
    	
    	while(redPt<nums.length && nums[redPt]==0)
    		redPt++;
    	
    	while(bluPt>=0 && nums[bluPt]==2)
    		bluPt--;
    	
    	int i=redPt;
    	while(i<=bluPt){//details!!!
    		if(nums[i]==2)
    			swap(nums,i,bluPt--);
    		else if(nums[i]==0)
    			swap(nums,redPt++,i++);//i need to increment as 1 will be put there!!!
    		else
    			i++;
    	}
    }
	
	public void swap(int[] nums, int left, int right){
		if(left==right)
			return;
		int tmp=nums[right];
		nums[right]=nums[left];
		nums[left]=tmp;
	}
}
