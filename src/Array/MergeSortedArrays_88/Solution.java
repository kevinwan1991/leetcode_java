package Array.MergeSortedArrays_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums1.length==0 || nums2==null || nums2.length==0)
        	return;
        
    	int pt1=m-1;
        int pt2=n-1;
        int pt=m+n-1;
        // Know how to use the space behind!!!
        while(pt1>=0 || pt2>=0){
        	if(pt1<0 || (pt2>=0 && nums1[pt1]<nums2[pt2]))
        		nums1[pt--]=nums2[pt2--];
        	else if(pt2<0 || (pt1>=0 && nums1[pt1]>=nums2[pt2]))
        		nums1[pt--]=nums1[pt1--];
        }
    }
}