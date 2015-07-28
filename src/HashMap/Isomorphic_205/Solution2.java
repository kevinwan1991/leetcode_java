package HashMap.Isomorphic_205;

import java.util.HashMap;
import java.util.HashSet;

// Forgot to use hashSet for detecting!!!!!
public class Solution2 {
    public boolean isIsomorphic(String s, String t) {
    	if((s==null && t!=null) || (t==null && s!=null) ||s.length()!=t.length())
    		return false;
    	
    	HashMap<Character,Character> map=new HashMap<Character,Character>();
    	HashSet<Character> ifPut=new HashSet<Character>();
    	char[] sArr=s.toCharArray();
    	char[] tArr=t.toCharArray();
    	
    	for(int i=0; i<sArr.length; i++){
    		if(map.containsKey(tArr[i])){
    			if(map.get(tArr[i])!=sArr[i])
    				return false;
    		}else{
    			if(ifPut.contains(sArr[i]))
    				return false;
    			map.put(tArr[i], sArr[i]);
    			ifPut.add(sArr[i]);
    		}
    	}
    	return true;
    }
}