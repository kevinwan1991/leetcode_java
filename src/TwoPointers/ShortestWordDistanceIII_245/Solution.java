package TwoPointers.ShortestWordDistanceIII_245;

public class Solution {
	public int shortestWordDistance(String[] words, String word1, String word2) {
        if(words==null || words.length==0)
        	return Integer.MAX_VALUE;
        
        int pt1=-1;
        int pt2=-1;
        int lottery=1;
        int min=Integer.MAX_VALUE;
        
        //The way to maintain pointers with out k^2 comparison!!!
        for(int i=0; i<words.length; i++){
        	if(words[i].equals(word1) && words[i].equals(word2)){
        		if(lottery%2==1)
        			pt1=i;
        		else
        			pt2=i;
        		lottery++;
        	}
        	else if(words[i].equals(word1))
        		pt1=i;
        	else if(words[i].equals(word2))
        		pt2=i;
        	if(pt1!=-1 && pt2!=-1)
        		min=Math.min(min,Math.abs(pt1-pt2));
        }
        return min;
    }
}
