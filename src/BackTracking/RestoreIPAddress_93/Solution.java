package BackTracking.RestoreIPAddress_93;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> resList=new ArrayList<String>();
        
        if(s==null || s=="" || s.length()<4 || s.length()>12)//Attention to special length!!!
        	return resList;
        
        helper(resList,s,"",0,0);
        return resList;
    }
    
    //we may also cut the string down: str.subString(0,i);
    public void helper(List<String> resList,String str,String validIP,int start,int sections){
    	if(start>=str.length() && sections==4){//Attention to the restriction of sections!
    		resList.add(validIP.substring(0,validIP.length()-1));
    		return;
    	}
    	for(int i=1; (i<=3)&&(start+i<=str.length()); i++){
    		String tmp=str.substring(start,start+i);
    		if(isValid(tmp))
    			helper(resList,str,validIP+tmp+".",start+i,sections+1);
    	}
    }
    
    public boolean isValid(String str){
    	if(str.charAt(0)=='0')
    		return str.equals("0");
    	int tmp=Integer.parseInt(str);
    	return (tmp<=255 && tmp>=0);
    }
}