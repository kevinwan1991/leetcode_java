package DFS.PopulatingNextRightPointersInEachNode_116;

public class Solution {
	// I believe bfs good for this, but dfs also works!!!
    public void connect(TreeLinkNode root) {
        if(root==null)
        	return;
        if(root.left!=null)
        	root.left.next=root.right;
        if(root.right!=null && root.next!=null)//never use root.next.right unless set condition!!!!
        	root.right.next=root.next.left;
        
        connect(root.left);
        connect(root.right);
    }
}