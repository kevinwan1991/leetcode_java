package String.CountAndSay_38;

public class Solution {
    public String countAndSay(int n) {
    	if(n==0)
    		return null;
    	
    	String res="1";
    	int num=1;
    	while(num<n){
    		StringBuilder sb=new StringBuilder();
    		int count=1;
    		
    		for(int i=1; i<res.length(); i++){
    			if(res.charAt(i)==res.charAt(i-1)){
    				count++;
    			}else{
    				sb.append(count);
    				sb.append(res.charAt(i-1));
    				count=1;
    			}
    		}
    		sb.append(count);
    		sb.append(res.charAt(res.length()-1));
    		res=sb.toString();
    		num++;
    	}
    	return res;
    }
}