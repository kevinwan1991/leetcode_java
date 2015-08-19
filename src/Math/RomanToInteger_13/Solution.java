package Math.RomanToInteger_13;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        if(s==null || s.length()==0)
            return 0;
            
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res=map.get(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            int prev=i-1;
            int curr=i;
            if(map.get(s.charAt(curr))<=map.get(s.charAt(prev)))
                res+=map.get(s.charAt(curr));
            else
                res=res-2*map.get(s.charAt(prev))+map.get(s.charAt(curr));
        }
        return res;
    }
}