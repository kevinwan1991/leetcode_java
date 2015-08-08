package Math.ExcelSheetColumnNumber_171;

public class Solution {
    public int titleToNumber(String s) {
        if(s==null || s.length()==0)
        	return 0;
        
        int num=0;
        char[] arr=s.toCharArray();
        for(int i=0; i<arr.length; i++){
        	int digit=arr[i]-'A'+1;
        	num=num*26+digit;
        }
        return num;
    }
}