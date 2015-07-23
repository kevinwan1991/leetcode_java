package HashMap.FourSum_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> resList=new ArrayList<List<Integer>>();
        //Natural mechanism for filtering:
        HashSet<ArrayList<Integer>> set=new HashSet<ArrayList<Integer>>();
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
        	for(int j=i+1; j<nums.length; j++){
        		int p=j+1;
        		int q=nums.length-1;
        		while(p<q){
        			int sum=nums[i]+nums[j]+nums[p]+nums[q];
        			if(sum<target)
        				p++;
        			else if(sum>target)
        				q--;
        			else{
        				ArrayList<Integer> tmpList=new ArrayList<Integer>();
        				tmpList.add(nums[i]);
        				tmpList.add(nums[j]);
        				tmpList.add(nums[p]);
        				tmpList.add(nums[q]);
        				if(!set.contains(tmpList)){
        					set.add(tmpList);
        					resList.add(tmpList);
        				}
        				p++;
        				q--;
        			}
        		}
        	}
        }
        return resList;
    }
}