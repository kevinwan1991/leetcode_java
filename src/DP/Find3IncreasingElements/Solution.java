package DP.Find3IncreasingElements;

public class Solution {
	// 给一个array，找到其中三个index依次增加的数，并且数值也是依次增加。要求O(n) time O(n) extra space
	
	public void find3IncreasingElements(int[] arr){
		//take number i as pivotal, check left less than num[i] and right bigger than num[i]
		int minIndexBefore[]=new int[arr.length]; //includes this position!
		int maxIndexAfter[]=new int[arr.length];
		
		for(int i=0; i<arr.length; i++){
			if(i==0 || arr[i]<arr[minIndexBefore[i-1]])
				minIndexBefore[i]=i;
			else
				minIndexBefore[i]=minIndexBefore[i-1];
		}
		
		for(int i=arr.length-1; i>=0; i--){
			if(i==arr.length-1 || arr[i]>arr[maxIndexAfter[i+1]])
				maxIndexAfter[i]=i;
			else
				maxIndexAfter[i]=maxIndexAfter[i+1];
		}
		
		for(int i=1; i<arr.length-1; i++){
			if(minIndexBefore[i]<arr[i] && maxIndexAfter[i]>arr[i])
				System.out.println(minIndexBefore[i]+","+i+","+maxIndexAfter[i]);
		}
	}
}
