package Bitwise.RepeatedDNASequences_187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s==null || s.length()<11)
        	return new ArrayList<String>();
        
        ArrayList<String> res=new ArrayList<String>();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);
        
        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> snd=new HashSet<Integer>();
        
        int hash=0;
        for(int i=0; i<s.length(); i++){
        	char c=s.charAt(i);
        	if(i<9)
        		hash=(hash<<2) + map.get(c);
        	else{
        		hash=(hash<<2) + map.get(c);
        		hash=hash&((1<<20)-1);
        		if(set.contains(hash) && !snd.contains(hash)){
        			res.add(s.substring(i-9, i+1));
        			snd.add(hash);
        		}else
        			set.add(hash);
        	}
        }
        return res;
    }
}