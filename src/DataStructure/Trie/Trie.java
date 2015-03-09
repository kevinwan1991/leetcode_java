package DataStructure.Trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {
	private TrieNode root;
	
	public Trie(){
		this.root=new TrieNode();
	}
	
	public void addWord(String word){
		root.addWord(word.toLowerCase());
	}
	
	public List<String> getWords(String prefix){
		ArrayList<String> resList=new ArrayList<String>();
		TrieNode tmpNode=root;
		for(int i=0; i<prefix.length(); i++){
			tmpNode=tmpNode.getNode(prefix.charAt(i));
			if(tmpNode==null)
				return resList;
		}
		return tmpNode.getWords(resList);
	}
}
