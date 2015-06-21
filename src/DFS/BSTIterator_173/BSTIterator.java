package DFS.BSTIterator_173;

public class BSTIterator {
	private TreeNode largest;
	private TreeNode smallest;
	private TreeNode curr;
	private TreeNode root;
	
    public BSTIterator(TreeNode root) {
        if(root==null)
        	return;
        
        TreeNode tmp=root;
        while(tmp.right!=null)
        	tmp=tmp.right;
        this.largest=tmp;
        
        tmp=root;
        while(tmp.left!=null)
        	tmp=tmp.left;
        this.smallest=tmp;
        
        this.root=root;
    }

    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(root!=null && (this.curr==null || this.curr.val<this.largest.val))
        	return true;
        else
        	return false;
    }

    /** @return the next smallest number */
    public int next() {
        if(this.curr==null){
        	this.curr=this.smallest;
        	return this.curr.val;
        }
        
        this.curr=helper(this.root,this.root);
        return this.curr.val;
    }
    // Module to find the 'ceiling'!
    public TreeNode helper(TreeNode node, TreeNode tmp){
    	if(node==null)
    		return tmp;
    	if(this.curr.val<node.val){
    		tmp=node;//be clear about updating tmp!
    		return helper(node.left,tmp);
    	}else{
    		return helper(node.right,tmp);
    	}
    }
    
    public static void main(String[] args){
    	TreeNode root=new TreeNode(1);
    	TreeNode right=new TreeNode(2);
    	root.right=right;
    	BSTIterator bst=new BSTIterator(root);
    	int k;
    	while (bst.hasNext()) 
    		k= bst.next();
    }
    /**
     * Your BSTIterator will be called like this:
     * BSTIterator i = new BSTIterator(root);
     * while (i.hasNext()) v[f()] = i.next();
     */
}
