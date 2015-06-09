package Trie.ImplementTrie_208;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }


    /** When using a data structure to contain multiple elements, 
     *  make sure no conflicts between them and all of them can be identified!
     */
    public void insert(String word) {
        char[] elements=word.toCharArray();
        TrieNode parent=this.root;
        TrieNode child;
        
        /**If the node is already inserted, don't interrupt!**/
        for(int i=0; i<elements.length; i++){
        	if(parent.map.containsKey(elements[i]))
        		parent=parent.map.get(elements[i]);
        	else{
        		child=new TrieNode(elements[i]);
            	parent.map.put(elements[i],child);
            	parent=child;
        	}
        	
        	/**Set end flag:then we know we have app and apps:**/
        	if(i==elements.length-1)
        		parent.isEnd=true;
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node=searchNode(word);
        if(node!=null && node.isEnd)
        	return true;
        return false;
    }
    
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(searchNode(prefix)!=null)
        	return true;
        else
        	return false;
    }
    
    public TrieNode searchNode(String word){
    	char[] elements=word.toCharArray();
        TrieNode tmp=root;

        for(int i=0; i<elements.length; i++){
        	if(tmp.map.containsKey(elements[i])){
        		tmp=tmp.map.get(elements[i]);
        	}else{
        		return null;
        	}
        }   
        return tmp;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");