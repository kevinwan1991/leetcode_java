package Array.ZigZagConversation_6;

public class Solution {
    public String convert(String s, int numRows) {
        if(s==null || s.length()==0)
        	return s;
        if(numRows==1)
        	return s;
        
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<numRows; i++){
        	for(int j=i; j<s.length(); j+=(2*numRows-2)){
        		sb.append(s.charAt(j));
        		if(i!=0 && i!=numRows-1)
        			if(j+2*numRows-2-2*i<s.length())
        				sb.append(s.charAt(j+2*numRows-2-2*i));
        	}
        }
        
        return sb.toString();
    }
}