package Sort.QuickSort;

public class QuickSort {
	private static int CUTOFF=5;
	
	private static void sort(int[] a, int lo, int hi){
		if (hi <= lo + CUTOFF - 1){
			InsertionSort(a, lo, hi);
			return;
		}
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	private static int partition(int[] a, int lo, int hi){
		int i = lo, j = hi+1;
		while (true){
			while (less(a[++i], a[lo]))
				if (i == hi) break;

			while (less(a[lo], a[--j]))
				if (j == lo) break;
			
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	private static void InsertionSort(int[] arr,int start,int end){	
	}
	
	private static void exch(int[] arr,int i, int j){
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	
	private static boolean less(int x, int y){
		return x-y<0;
	}
}
