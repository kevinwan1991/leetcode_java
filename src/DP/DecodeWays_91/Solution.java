package DP.DecodeWays_91;

public class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0 || s.charAt(0)=='0')
        	return 0;
      	
        int[] way=new int[s.length()];
        way[0]=1;
        if(s.length()==1)	return way[0];
        
        way[1]=(s.charAt(1)=='0')?0:way[0];
        if(Integer.parseInt(s.substring(0,2))<=26 && Integer.parseInt(s.substring(0,2))>=0)
        	way[1]++;

        
        for(int i=2; i<s.length(); i++){
        	way[i]=(s.charAt(i)=='0')?0:way[i-1];
        	int tmp=Integer.parseInt(s.substring(i-1,i+1));
        	way[i]=way[i]+((tmp<=26 && tmp>=10)?way[i-2]:0);
        }
        
        return way[s.length()-1];
    }
}