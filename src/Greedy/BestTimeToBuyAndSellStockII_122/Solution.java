package Greedy.BestTimeToBuyAndSellStockII_122;

public class Solution {
    public int maxProfit(int[] prices) {
    	int max=0;
    	for(int i=1; i<prices.length; i++){
    		int offset=prices[i]-prices[i-1];
    		if(offset>0)
    			max+=offset;
    	}
    	return max;
    }
}