package Array.PacalTriangleII_119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> resList=new ArrayList<Integer>();
    	
    	if(rowIndex<0)
    		return resList;
    	
    	resList.add(1);
    	if(rowIndex==0)
    		return resList;
    	
    	for(int i=1; i<=rowIndex; i++){
    		int prev=-1;
    		for(int j=1; j<i; j++){
    			int tmp=resList.get(j);
    			if(prev==-1)
    				resList.set(j, resList.get(j-1)+resList.get(j));//need a value to hold resList(i) as it changed after calculation!!!
    			else
    				resList.set(j, prev+resList.get(j));
    			prev=tmp;
    		}
    			
    		resList.add(1);
    	}
    	return resList;
    }
}