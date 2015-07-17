package LinkedList.ValidPalidrome_125;

public class Solution {
    public boolean isPalindrome(String s) {
    	s=s.toLowerCase();
        char[] letters=s.toCharArray();
        int i=0, j=letters.length-1;
        char left,right;
        while(i<j){
        	left=letters[i];
        	if(!(Character.isLetter(left) || Character.isDigit(left))){
        		i++;
        		continue;
        	}
        	right=letters[j];
        	if(!(Character.isLetter(right)|| Character.isDigit(right))){
        		j--;
        		continue;
        	}
        	if(left!=right)
        		return false;
        	i++;
        	j--;
        }
        return true;
    }
}