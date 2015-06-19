package HashMap.Isomorphic_205;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
    	HashMap<Character,Character> map=new HashMap<Character,Character>();
    	HashMap<Character,Character> map1=new HashMap<Character,Character>();
    	char[] sArr=s.toCharArray();
    	char[] tArr=t.toCharArray();
    	
    	for(int i=0; i<sArr.length; i++){
    		char sTmp=sArr[i];
    		char tTmp=tArr[i];
    		
    		if(!map.containsKey(sTmp)){
    			if(map1.containsKey(tTmp))
    				return false;
    			else{
    				map.put(sTmp, tTmp);
    				map1.put(tTmp, sTmp);
    			}
    		}else{
    			if(map.get(sTmp)!=tTmp)
    				return false;
    		}
    	}
    	return true;
    }
}