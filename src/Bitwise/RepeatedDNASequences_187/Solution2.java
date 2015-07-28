package Bitwise.RepeatedDNASequences_187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public List<String> findRepeatedDnaSequences(String s) {
    	//Plan to hash 10-char substring before;
    	//Then switch to 20-bit integer for smaller space;
    	HashMap<Character,Integer> char2int=new HashMap<Character,Integer>();
    	char2int.put('A',0);
    	char2int.put('C',1);
    	char2int.put('G',2);
    	char2int.put('T',3);
    	
    	HashSet<Integer> fst=new HashSet<Integer>();
    	HashSet<Integer> snd=new HashSet<Integer>();
    	List<String> resList=new ArrayList<String>();
    	
    	int bitStr=0;
    	for(int i=0; i<s.length(); i++){
    		if(i<9){
    			bitStr=(bitStr<<2)|char2int.get(s.charAt(i));
    		}else{
    			bitStr=(bitStr<<2)|char2int.get(s.charAt(i));
    			// Using number instead of string, no need to change starting pointer!
    			bitStr=((1<<20)-1)&bitStr;
    			if(fst.contains(bitStr) && !snd.contains(bitStr)){
    				snd.add(bitStr);
    				resList.add(s.substring(i-9,i+1));
    			}else
    				fst.add(bitStr);
    		}
    	}
    	return resList;
    }
}