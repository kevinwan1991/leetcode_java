package String.LengthOfLastWord_58;

public class Solution {
	// Better to start from end!!!
    public int lengthOfLastWord(String s) {
        char[] arr=s.toCharArray();
        int unitLen=0;
        int len=arr.length-1;
        
        while(len>=0 && arr[len]==' ')//watch out for index!!
        	len--;
        
        for(int i=0; i<=len; i++){
        	if(arr[i]==' ')
        		unitLen=0;
        	else
        		unitLen++;
        }
        return unitLen;
    }
}