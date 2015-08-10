package TwoPointers.TwoSumII_InputArraySorted_167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length==0)
        	return null;
        
        int[] resArr=new int[2];
        int pt1=0,pt2=numbers.length-1;
        while(pt1<pt2){
        	if(numbers[pt1]+numbers[pt2]==target){
        		resArr[0]=pt1+1;
        		resArr[1]=pt2+1;
        		return resArr;
        	}else if(numbers[pt1]+numbers[pt2]<target){
        		pt1++;
        	}else
        		pt2--;
        }
        return null;
    }
}