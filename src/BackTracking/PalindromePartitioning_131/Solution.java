package BackTracking.PalindromePartitioning_131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
    	List<List<String>> resList=new ArrayList<List<String>>();
        List<String> tmpList=new ArrayList<String>();
        
        helper(resList,tmpList,0,s);
        return resList;
    }
    
    public void helper(List<List<String>> resList,List<String> tmpList,int start,String s){
    	if(start>=s.length()){
    		resList.add(new ArrayList<String>(tmpList));
    		return;
    	}
    	// We only need to list out!!!
    	for(int i=start+1; i<=s.length(); i++){
    		String tmpStr=s.substring(start,i);
    		if(isPalindrome(tmpStr)){
    			tmpList.add(tmpStr);
    			helper(resList,tmpList,i,s);// next to i not start+1;
    			tmpList.remove(tmpList.size()-1);
    		}
    	}
    }
    
    public boolean isPalindrome(String s){
    	if(s==null || s.equals(""))
    		return true;
    	
    	char[] arr=s.toCharArray();
    	
    	int i=0;
    	int j=s.length()-1; 
    	while(i<=j){
    		if(arr[i]!=arr[j])
    			return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}