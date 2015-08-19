package Array.MissingRanges_163;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> resList=new ArrayList<String>();
        if(nums==null || nums.length==0){
            if(upper>lower)
                resList.add(lower+"->"+upper);
            else if(upper==lower)
                resList.add(lower+"");
            return resList;
        }
        
        for(int i=0; i<nums.length; i++){
            if(i==0){
                if(nums[i]-lower>1)
                    resList.add(lower+"->"+(nums[i]-1));
                else if(nums[i]-lower==1)
                    resList.add(lower+"");
            }
            
            if(i>0 && nums[i]>=nums[i-1]+2){
                if(nums[i]-nums[i-1]>2)
                    resList.add((nums[i-1]+1)+"->"+(nums[i]-1));
                else
                    resList.add((nums[i-1]+1)+"");
            }
            
            if(i==nums.length-1){
                if(upper-nums[i]>1)
                    resList.add((nums[i]+1)+"->"+upper);
                else if(upper-nums[i]==1)
                    resList.add(upper+"");
            }
            
            
        }
        return resList;
    }
}