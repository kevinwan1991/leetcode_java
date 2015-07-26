package BackTracking.LetterCombinationsOfPhoneNumber_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,char[]> map=new HashMap<Character,char[]>();
        map.put('2', new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});
        
        List<String> resList=new ArrayList<String>();
        if(digits==null || digits.equals(""))
        	return resList;
        	
        char[] nums=digits.toCharArray();
        helper(resList,map,nums,"",0);
        
        return resList;
    }
    
    public void helper(List<String> resList,HashMap<Character,char[]> map,char[] nums,String str,int start){
    	if(str.length()==nums.length){
    		resList.add(str);
    		return;
    	}
    	for(int i=start; i<nums.length; i++){
    		char[] arrChar=map.get(nums[i]);
    		for(int j=0; j<arrChar.length; j++){
    			char tmp=arrChar[j];
    			helper(resList,map,nums,str+tmp,i+1);
    		}
    	}
    }
}