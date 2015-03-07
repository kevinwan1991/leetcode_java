package DFS.leastCommonAncestor;

public class Solution {
	public Node leastCommonAncestor(Node root, Node n1, Node n2){
		if(root==null)
			return null;
		if(root.equals(n1) || root.equals(n2))
			return root;
		
		Node left=leastCommonAncestor(root.left,n1,n2);
		Node right=leastCommonAncestor(root.right,n1,n2);
		
		if(left!=null && right!=null)
			return root;
		//right can be null or not, nice way to write code:
		return left!=null?left:right;
	}
}
