package TwoPointers.ImplementstrStr_28;

public class Solution {
    public int strStr(String haystack, String needle) {
    	if(needle.length()>haystack.length())
    		return -1;
    	
    	if(needle.equals("") || needle==null)
    		return 0;
    	
        char[] hayArr=haystack.toCharArray();
        char[] neeArr=needle.toCharArray();

        for(int i=0; i<hayArr.length-neeArr.length+1; i++){
        	int hayPt=i;
        	int neePt=0;
        	boolean ifExist=true;
        	while(neePt<neeArr.length){
        		if(hayArr[hayPt]!=neeArr[neePt]){
        			ifExist=false;
        			break;
        		}
        		hayPt++;
        		neePt++;
        	}
        	if(ifExist)
        		return i;
        }
        return -1;
    }
}
