package DP.LongestIncreaingSubsequence;

import java.util.Arrays;

public class Solution {
	public int longestIncreasingSubsequence(int[] arr){
		int max=1;
		int[] maxBefore=new int[arr.length];
		Arrays.fill(maxBefore,1);
		
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j])
					maxBefore[i]=Math.max(maxBefore[i],maxBefore[j]+1);
				max=Math.max(max, maxBefore[i]);
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		int[] arr=new int[]{10, 22, 9, 33, 21, 50, 41, 10};
		Solution s=new Solution();
		int max=s.longestIncreasingSubsequence(arr);
		System.out.println(max);
	}
}
