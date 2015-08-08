package DP.BestTimeToBuyAndSellStockIII_123;

public class Solution {
	//If I can find a recursion way: do it!
	//time complexity is O(n*n)
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1)
        	return 0;
        
        int max=0;
        for(int i=0; i<=prices.length-2; i++){
        	int max1=maxSingleTransaction(prices,0,i);
        	int max2=maxSingleTransaction(prices,i+1,prices.length-1);
        	max=Math.max(max1, max1+max2);
        }
        return max;
    }
    // This function hasn't use historical info;
    // So we build arrays for it!!
    public int maxSingleTransaction(int[] prices,int start,int end){
    	int min=Integer.MAX_VALUE;
    	int max=Integer.MIN_VALUE;
    	for(int i=start; i<=end; i++){
    		min=Math.min(min,prices[i]);
    		max=Math.max(max, prices[i]-min);
    	}
    	return max;
    }
}