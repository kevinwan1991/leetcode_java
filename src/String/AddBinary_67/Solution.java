package String.AddBinary_67;

public class Solution {
    public String addBinary(String a, String b) {
        if(a==null || a.length()==0 || b==null || b.length()==0)
        	return null;
        
        int i=0;
        int carr=0;
        StringBuilder sb=new StringBuilder();
        
        while(i<a.length() || i<b.length()){
        	int num=0;
        	num+=carr;
        	if(i<a.length() && a.charAt(a.length()-1-i)=='1')
        		num++;
        	if(i<b.length() && b.charAt(b.length()-1-i)=='1')
        		num++;
        	carr=num/2;
        	sb.append(num%2);
        	i++;
        }
        if(carr!=0)
        	sb.append(carr);
        
        return sb.reverse().toString();
    }
}