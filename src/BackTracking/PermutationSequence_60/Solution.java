package BackTracking.PermutationSequence_60;

import java.util.ArrayList;

public class Solution{
	public String getPermutation(int n, int k) {
		
		k--;//first sequence 1: 0/2!=0,1/2!=0; so first num will be 0;
		int factorial=1;
		ArrayList<Integer> numList=new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			numList.add(i);
			factorial*=i;
		}
		factorial/=n;
		
		StringBuilder sb=new StringBuilder();
		int timer=n-1;
		while(timer>=0){
			int index=k/factorial;
			sb.append(numList.get(index));
			numList.remove(index);//most important part!!!!!!!!
			
			k=k%factorial;
			if(timer!=0)//keep in mind!!!!!!!!!!
				factorial=factorial/timer;
			timer--;
		}
		return sb.toString();
	}
}