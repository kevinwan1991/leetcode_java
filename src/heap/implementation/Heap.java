package Heap.implementation;

import java.util.Arrays;

public class Heap {
	//make a max-heap first:
	public static void sink(int[] arr, int k, int N){
		while(k*2 <= N){
			int p=2*k;
			p=(p<N && less(arr,p,p+1))? p+1:p;
			if(!less(arr,k,p))
				break;
			swap(arr, k, p);
			k=p;
		}
	}
	
	private static boolean less(int[] arr, int i, int j) {
        return arr[i-1]-arr[j-1] < 0;
    }
	
	public static void swap(int[] arr, int k, int p){
		int tmp=arr[k-1];
		arr[k-1]=arr[p-1];
		arr[p-1]=tmp;
	}
	
	public static void sort(int[] arr){
		//to form normal max-heap but not sorted:
		int N=arr.length;
		for(int k=N/2; k>=1; k--){// N/2:is exactly the last node on level 2!
			sink(arr,k,N);
		}
		//to heapify and get sorted:
		while(N>1){
			swap(arr,1,N--);
			sink(arr,1,N);
		}
	}
	
	public static void main(String[] args){
		int[] input={3,5,6,1,2,12,27};
		Heap.sort(input);
		System.out.print(Arrays.toString(input));
	}
}
