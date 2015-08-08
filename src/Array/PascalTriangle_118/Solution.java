package Array.PascalTriangle_118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> resList=new ArrayList<List<Integer>>();
    	
    	if(numRows<=0)
    		return resList;
    	
    	int row=1;
    	while(row<=numRows){
    		List<Integer> tmpList=new ArrayList<Integer>();
    		tmpList.add(1);
    		
    		List<Integer> upperList=null;
    		if(row>1)
    			upperList=resList.get(row-2);
    		for(int i=1; i<=row-2; i++){
    			tmpList.add(upperList.get(i-1)+upperList.get(i));
    		}
    		
    		if(row>1)
    			tmpList.add(1);
    		
    		resList.add(tmpList);
    		row++;
    	}
    	
    	return resList;
    }
}