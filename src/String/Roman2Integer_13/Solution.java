package String.Roman2Integer_13;

public class Solution {
	//iterate the string, if previous one is bigger or equal to you, then add;
	//else just minus 2 times of the previous one and add itself:
    public int romanToInt(String s) {
        if(s==null || s.length()==0)
        	return 0;
        
        char[] charArr=s.toCharArray();
        int sum=0;
        for(int i=0; i<s.length(); i++){
        	if(i==0)
        		sum+=char2Int(charArr[i]);
        	else if(char2Int(charArr[i-1])<char2Int(charArr[i])){
        		sum=sum-2*char2Int(charArr[i-1])+char2Int(charArr[i]);
        	}else
        		sum+=char2Int(charArr[i]);
        }
        
        return sum;
    }
    
    public int char2Int(char input){
    	int data=0;
    	switch(input){
    	case 'I': 	data=1;
    				break;
    	case 'V':	data=5;
    				break;
    	case 'X':	data=10;
    				break;
    	case 'L':	data=50;
    				break;
    	case 'C':	data=100;
					break;
    	case 'D':	data=500;
					break;
    	case 'M':	data=1000;
					break;
    	}
    	return data;
    }
}