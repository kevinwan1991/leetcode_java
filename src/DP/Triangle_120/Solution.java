package DP.Triangle_120;

import java.util.List;

// DP also can go from bottom to top!!!
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null || triangle.size()==0)
        	return 0;
        
        int[] minPath=new int[triangle.size()];
        for(int i=0; i<triangle.get(triangle.size()-1).size(); i++)
        	minPath[i]=triangle.get(triangle.size()-1).get(i);
        
        for(int i=triangle.size()-2; i>=0; i--){
        	for(int j=0; j<triangle.get(i+1).size()-1; j++)
        		minPath[j]=triangle.get(i).get(j)+Math.min(minPath[j],minPath[j+1]);
        }
        return minPath[0];
    }
}