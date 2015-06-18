package Greedy.GasStation_134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	if(gas==null ||cost==null ||gas.length==0|| cost.length==0 ||gas.length!=cost.length)
    		return -1;
    	
    	int total=0;
    	int tmpSum=0;
    	int index=0;
    	
    	// Two Facts:
    	// 1. total>0 finishable;
    	// 2. if tmpSum<0 at i, then from 0->i, every start point will fail;
    	for(int i=0; i<gas.length; i++){
    		if(tmpSum>=0){
    			tmpSum+=(gas[i]-cost[i]);
    		}else{
    			index=i;
    			tmpSum=(gas[i]-cost[i]);
    		}
    		total+=(gas[i]-cost[i]);
    	}
    	
    	if(total<0)
    		return -1;
    	else
    		return index;
    }
}