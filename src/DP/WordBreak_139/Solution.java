package DP.WordBreak_139;

import java.util.Set;

// I know recursion way sucks, but at least I know the relationship!
public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null || s.length()==0 || wordDict==null || wordDict.size()==0)
        	return false;
        
        if(wordDict.contains(s))
        	return true;
        
        for(int i=1; i<s.length(); i++){
        	String left=s.substring(0, i);
        	String right=s.substring(i,s.length());
        	if(wordBreak(left,wordDict) && wordBreak(right,wordDict))
        		return true;
        }
        return false;
    }
}