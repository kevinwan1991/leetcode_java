package BackTracking.GrayCode_89;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
    	if(n==0){
    		ArrayList<Integer> resList=new ArrayList<Integer>();
    		resList.add(0);
    		return resList;
    	}
    	
    	List<Integer> resList=grayCode(n-1);
    	int addNum=1<<(n-1);
    	
    	for(int i=resList.size()-1; i>=0; i--)
    		resList.add(addNum+resList.get(i));
    	
    	return resList;
    }
}