package Fidessa.MergeTwoSortedList;

import java.util.Arrays;

public class Solution {
	public int[] mergeTwoSortedList(int[] arr1,int[] arr2){
		int pt1=0,pt2=0,pt=0;
		int[] arr=new int[arr1.length+arr2.length];
		
		while(pt1<arr1.length && pt2<arr2.length){
			if(arr1[pt1]<=arr2[pt2])
				arr[pt++]=arr1[pt1++];
			else
				arr[pt++]=arr2[pt2++];
		}
		
		while(pt1<arr1.length)
			arr[pt++]=arr1[pt1++];
		
		while(pt2<arr2.length)
			arr[pt++]=arr2[pt2++];
		
		return arr;
	}
	
	public static void main(String[] args){
		int[] arr1=new int[]{3,6,10,23,66};
		int[] arr2=new int[]{1,2,4,7,8,11,22,34,67};
		Solution s=new Solution();
		int[] arr=s.mergeTwoSortedList(arr1, arr2);
		System.out.println(Arrays.toString(arr));
	}
}
