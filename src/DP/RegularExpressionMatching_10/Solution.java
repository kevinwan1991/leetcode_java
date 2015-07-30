package DP.RegularExpressionMatching_10;

public class Solution {
    public boolean isMatch(String s, String p) {
    	/*if(s==null && p==null)
    		return true;
    	if((s==null && p!=null) || (s!=null && p==null))
    		return false;*/
    	helper(s,p);
    	return helper(s,p);
    }
    
    public boolean helper(String str,String pat){
    	if(pat.equals(""))
    		return str.equals("");
    	if(str.equals("")){
    		if(pat.equals(""))
    			return true;
    		if(pat.length()==1)
    			return false;
    		//May happen pat='a*b*c*' that is still true!
    	}
    	
    	if(pat.length()>=2 && pat.charAt(1)=='*'){
    		if(helper(str,pat.substring(2)))// '' also matches 'a*'
    			return true;
    		for(int i=0; (i<str.length())&&(isMatch(str.charAt(i),pat.charAt(0))); i++){
    			if(helper(str.substring(i+1),pat.substring(2)))
    				return true;
    		}
    	}else{
    		if(str.equals(""))
    			return false;
    		if(isMatch(str.charAt(0),pat.charAt(0)))
    			return helper(str.substring(1),pat.substring(1));
    	}
    	return false;
    }
    
    public boolean isMatch(char str,char pat){
    	if(pat=='.')
    		return true;
    	return pat==str;
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	s.isMatch("a", ".*..");
    }
}