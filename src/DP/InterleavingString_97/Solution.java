package DP.InterleavingString_97;

// Recursion answer: may become 2^n
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1==null || s2==null || s3==null)
        	return false;
        if(s3.length()!=(s1.length()+s2.length()))
        	return false;
        
        return helper(s1,0,s2,0,s3,0);
    }
    
    public boolean helper(String s1,int p1,String s2,int p2,String s3,int p3){
    	if(p3==s3.length())
    		return true;
    	if(p1==s1.length())
    		return s2.substring(p2,s2.length())==s3.substring(p3,s3.length());
    	if(p2==s2.length())
    		return s1.substring(p1, s1.length())==s3.substring(p3,s3.length());
    	
    	if(s1.charAt(p1)==s3.charAt(p3) && s2.charAt(p2)==s3.charAt(p3))
    		return helper(s1,p1+1,s2,p2,s3,p3+1) || helper(s1,p1,s2,p2+1,s3,p3+1);
    	if(s1.charAt(p1)==s3.charAt(p3))
    		return helper(s1,p1+1,s2,p2,s3,p3+1);
    	if(s2.charAt(p2)==s3.charAt(p3))
    		return helper(s1,p1,s2,p2+1,s3,p3+1);
    	return false;
    }
}