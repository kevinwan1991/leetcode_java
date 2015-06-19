package Sort.KthLargestInArray_215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
    	if(nums==null || nums.length==0 || nums.length<k)
    		return 0;
    	
    	return helper(nums,0,nums.length-1,k-1);// Kth is No.(k-1)!
    }
    
    public int helper(int[] nums, int start, int end, int k){
    	int fakeMid=partition(nums, start, end);
    	if(k==fakeMid)
    		return nums[fakeMid];
    	if(k<fakeMid)
    		return helper(nums,start,fakeMid,k);
    	else
    		return helper(nums,fakeMid+1,end,k);
    		//we give back absolute value of index, so pass absolute k to the function!
    }
    
    //sort the array big to small!
    public int partition(int[] nums, int start, int end){
    	if(end-start==0)
    		return start;
    	
    	int i=start;
    	int j=end+1;
    	while(true){
    		while(!less(nums[++i],nums[start]))
    			if(i==end)	break;
    		while(!less(nums[start],nums[--j]))
    			if(j==start)  break;
    		
    		if(i>=j)
    			break;
    		exchange(nums,i,j);
    	}
    	exchange(nums,start,j);
    	return j;
    }
    
    public boolean less(int x, int y){
    	return x-y<0;
    }
    public void exchange(int[] nums, int i, int j){
    	int tmp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=tmp;
    }
    
    public static void main(String[] args){
    	int[] arr=new int[]{2,1};
    	Solution s=new Solution();
    	s.findKthLargest(arr, 2);
    }
}