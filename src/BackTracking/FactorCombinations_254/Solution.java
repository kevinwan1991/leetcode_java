package BackTracking.FactorCombinations_254;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> resList=new ArrayList<List<Integer>>();
        List<Integer> tmpList=new ArrayList<Integer>();
        
        if(n<=2)
            return resList;
        
        helper(n,2,tmpList,resList);
        return resList;
    }
    
    public void helper(int num,int factor,List<Integer> tmpList,List<List<Integer>> resList){
        if(num==1){
            if(tmpList.size()>1)
                resList.add(new ArrayList<Integer>(tmpList));
            return;
        }
        
        for(int i=factor; i<=num; i++){
            if(num%i==0){
                tmpList.add(i);
                helper(num/i,i,tmpList,resList);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}