package DFS.ConvertSortedArratToBST_108;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)
            return  null;
        
        return helper(nums,0,nums.length-1);        
    }
    
    public TreeNode helper(int[] nums,int start,int end){
        if(start==end)
            return new TreeNode(nums[start]);
        
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(nums[mid]);
        if(mid>start)
            node.left=helper(nums,start,mid-1);
        if(mid<end)
            node.right=helper(nums,mid+1,end);
        return node;
    }
}