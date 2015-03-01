package Filling_Algorithm;

import java.util.Arrays;

public class Test {
	public static void main(String args[]){
		int[][] screen={{1,1,1,1,1,1,1,1},
						{1,2,2,2,3,3,3,1},
						{1,3,3,3,1,1,1,1},
						{2,2,2,2,2,3,3,3},
						{2,2,2,1,1,1,1,1},
						{1,3,3,3,1,1,1,1},
						{2,2,2,2,2,3,3,3},
						{2,2,2,1,1,1,1,1},
						};
		Test.print2D(screen);
		//FloodFill.floodFill(screen, 4, 4, 0);
		BoundaryFill.boundFill(screen, 3, 3, 1, 0);
		Test.print2D(screen);
	}
	
	public static void print2D(int[][] screen){
		for(int[] tmp:screen)
			System.out.println(Arrays.toString(tmp));
		System.out.println();
	}
}
