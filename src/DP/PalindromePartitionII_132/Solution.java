package DP.PalindromePartitionII_132;

public class Solution {
    public int minCut(String s) {
    	if(s==null || s.length()==0)
    		return 0;
    	
    	int[][] dp=new int[s.length()][s.length()];
    	for(int i=0; i<s.length(); i++)
    		dp[i][i]=0;
    	
    	for(int i=0; i<=s.length()-2; i++){
    		if(s.charAt(i)==s.charAt(i+1))
    			dp[i][i+1]=0;
    		else
    			dp[i][i+1]=1;
    	}
    
    	for(int len=2; len<s.length(); len++){
    		for(int i=0; i<s.length()&&i+len<s.length(); i++){
    			int j=i+len;
    			if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==0)
    				dp[i][j]=0;
    			else{//Bloody lesson!!!!!!!!!! ELSE!!!!!!!!!!
    				int left=dp[i][j-1];
    				int down=dp[i+1][j];
    				dp[i][j]=Math.min(dp[i][j-1],dp[i+1][j])+1;//Algo wrong: 
    				int res=dp[i][j];                          //ababcb=aba+bcb but x(ababc)+b or a+x(babcb) can't cover this!!!
    			}
    		}
    	}
    	
    	return dp[0][s.length()-1];
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	int x=s.minCut("cabababcbc");
    	System.out.println(x);
    }
}