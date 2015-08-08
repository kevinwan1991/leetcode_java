package DP.WordBreak_139;

import java.util.Set;

// I know recursion way sucks, but at least I know the relationship!
public class Solution2 {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null || s.length()==0 || wordDict==null || wordDict.size()==0)
        	return false;
        
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0; i<s.length(); i++){
        	if(!dp[i])
        		continue;
        	
        	for(String word:wordDict){
        		int end=i+word.length(); //i not included in previous word!!
        		if(end>s.length())
        			continue;
        		if(dp[end])
        			continue;
        		
        		if(s.substring(i,end).equals(word))
        			dp[end]=true;
        	}
        }
        return dp[s.length()];
    }
}