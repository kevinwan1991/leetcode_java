package String.KMP;

public class Solution {
	public boolean isSubstring(String Big, String Small){
		int[] cover=getCover(Small);
		char[] big=Big.toCharArray();
		char[] small=Small.toCharArray();
		
		
		if(getSubstring(big,0,small,cover))
			return true;
		return false;
	}
	
	public boolean getSubstring(char[] big,int startB, char[] small, int[] cover){
		int pointB=startB;
		int pointS=0;
		while(pointB<big.length && pointS<small.length){
			if(big[pointB]==small[pointS]){
				pointB++;
				pointS++;
			}else if(pointS==0)
				pointB++;
			else
				//check how many elements previous one covers:
				//ABCIIIABD, if at 'D'not match, then pointer go to 'C',as B cover 1(actually 2),
				//then pointer need to go to position 2, where 'C' is:
				pointS=cover[pointS-1]+1;
		}
		if(pointS==small.length)
			return true;
		return false;
	}
	
	//DP relation: if cover[i-1]==5, then if i matches with j, then it can cover 6.
	public int[] getCover(String str){
		char[] charArr=str.toCharArray();
		int[] cover=new int[str.length()];
		cover[0]=-1;
		for(int i=1; i<str.length(); i++){
			int preNumOfCvr=cover[i-1];
			if(charArr[i]==charArr[preNumOfCvr+1])
				cover[i]=preNumOfCvr+1;
			else
				cover[i]=-1;
		}
		return cover;
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		System.out.println(solution.isSubstring("chinese", "cese"));
	}
}
