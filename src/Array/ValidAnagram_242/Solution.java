package Array.ValidAnagram_242;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
    	if((s==null && t==null) || (s.equals("") && t.equals("")))
    		return true;
    	
    	if(s==null || t==null)
    		return false;
    	
    	char[] sArr=s.toCharArray();
        Arrays.sort(sArr);
        s=new String(sArr);
        
        char[] tArr=t.toCharArray();
        Arrays.sort(tArr);
        t=new String(tArr);
        
        return s.equals(t);
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	s.isAnagram("a", "a");
    }
    
}