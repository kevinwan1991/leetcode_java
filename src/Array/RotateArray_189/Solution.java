package Array.RotateArray_189;

public class Solution {
    public void rotate(int[] nums, int k) {
    	if(nums==null || nums.length==0)
    		return;
    	
    	k=k%nums.length;
    	int[] res=new int[nums.length];
    	
    	int j=0;
    	for(int i=k; i<nums.length; i++,j++){
    		res[i]=nums[j];
    	}
    	
    	for(int i=0; i<k; i++){
    		res[i]=nums[i+nums.length-k];
    	}
    	
    	// nums=res; this will lose track of the original array!
    	// copy array to an existing array:
    	System.arraycopy(res, 0, nums, 0, nums.length);
    	// last parameter is length! 
    	// creating a new array by copying from nums[]:
    	// Arrays.copyOf(res,nums.length);
    }
    
    
    public void rotate_inPlace(int[] nums, int k){
    	// Array in-place operation: swap!!
    	if(nums==null || nums.length==0)
    		return;
    	
    	k=k%nums.length;
    	converter(nums,0,nums.length-1-k);
    	converter(nums,nums.length-k,nums.length-1);
    	converter(nums,0,nums.length-1);
    }
    public void converter(int[] nums,int left,int right){
    	if(nums==null || nums.length<=1)
    		return;
    	
    	int tmp;
    	while(left<right){
    		tmp=nums[left];
    		nums[left]=nums[right];
    		nums[right]=tmp;
    		left++;
    		right--;
    	}
    }
    
    public static void main(String[] args){
    	int[] arr=new int[]{1,2,3};
    	Solution s=new Solution();
    	s.rotate(arr, 1);
    }
}