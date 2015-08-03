package String.LongCommonPrefix_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        	return "";
        
        StringBuilder sb=new StringBuilder();
        int index=0;
        
        outerloop:
        while(index<strs[0].length()){
        	char tmp=strs[0].charAt(index);
        	for(int i=0;i<strs.length;i++){
        		if(index>=strs[i].length() || strs[i].charAt(index)!=tmp)
        			break outerloop;
        	}
        	sb.append(tmp);
        	index++;
        }
        return sb.toString();
    }
}