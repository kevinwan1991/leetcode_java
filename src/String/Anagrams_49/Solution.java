package String.Anagrams_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> anagrams(String[] strs) {
    	List<String> resList=new ArrayList<String>();
    	
    	if(strs==null)
    		return resList;
    	
    	HashMap<String,ArrayList<Integer>> map=new HashMap<String,ArrayList<Integer>>();
    	for(int i=0; i<strs.length; i++){
    		char[] arr=strs[i].toCharArray();
    		Arrays.sort(arr);
    		String tmp=String.valueOf(arr);
    		if(!map.containsKey(tmp)){
    			ArrayList<Integer> tmpList=new ArrayList<Integer>();
    			tmpList.add(i);
    			map.put(tmp, tmpList);
    		}else
    			map.get(tmp).add(i);
    	}
    		
    	for(ArrayList<Integer> tmpList: map.values()){
    		if(tmpList.size()>1){
    			for(int index:tmpList){
    				resList.add(strs[index]);
    			}
    		}
    	}
    	return resList;
    }
}