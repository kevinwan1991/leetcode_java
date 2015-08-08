package DP.BestTimeToBuyAndSellStockIII_123;

public class Solution2 {
	
	//Still one-D DP!!! stuff from left and stuff to the right!!!!!!!!!!1
    public int maxProfit(int[] prices) {
    	if(prices==null || prices.length<=1)
        	return 0;
    	
    	//Construct the "0...i" max by DP:
    	int[] leftToI=new int[prices.length];
    	int min=prices[0];
    	leftToI[0]=0;
    	for(int i=1; i<prices.length; i++){
    		min=Math.min(min, prices[i]);
    		leftToI[i]=Math.max(leftToI[i-1],prices[i]-min);
    	}
    	
    	//Construct the "i....n-1" max by DP:
    	int[] iToN=new int[prices.length];
    	int max=prices[prices.length-1];
    	iToN[prices.length-1]=0;
    	for(int i=prices.length-2; i>=0; i--){
    		max=Math.max(max, prices[i]);
    		iToN[i]=Math.max(iToN[i+1],max-prices[i]);
    	}
    	
    	//Try the combination:
    	int maxPro=0;
    	for(int i=0; i<prices.length; i++)
    		maxPro=Math.max(maxPro, leftToI[i]+iToN[i]);
    	
    	return maxPro;
    }
}