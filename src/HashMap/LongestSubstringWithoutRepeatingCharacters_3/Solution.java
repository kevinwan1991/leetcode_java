package HashMap.LongestSubstringWithoutRepeatingCharacters_3;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if(s==null || s=="" || s.toCharArray().length==0)
    		return 0;
    	char[] arr=s.toCharArray();
    	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
    	
    	int max=1;
    	int pt1=0;
    	int pt2=0;
    	while(pt2<arr.length){
    		if(!map.containsKey(arr[pt2])){
    			map.put(arr[pt2],pt2);
    			pt2++;
    		}else{
    			max=Math.max(pt2-pt1, max);
    			
    			int newPos=map.get(arr[pt2]);
    			for(int k=pt1; k<=newPos; k++){
    				map.remove(arr[k]);
    			}
    			map.put(arr[pt2], pt2);
    			pt1=newPos+1;
    			pt2++;
    		}
    	}
    	max=Math.max(pt2-pt1, max);
    	return max;
    }
}