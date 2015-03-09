package DataStructure.Trie;

import java.util.List;

public class TrieNode {
	private TrieNode parent;
	private TrieNode[] children;
	private char value;
	private boolean isLeaf;
	private boolean isEndOfWord;//Judge if a word has ended here.
	
	//For root only:
	public TrieNode(){
		this.children=new TrieNode[26];
		this.isLeaf=true;
		this.isEndOfWord=false;
	}
	
	//For elements:
	public TrieNode(char value){
		this();
		this.value=value;
	}
	
	protected void addWord(String word){
		this.isLeaf=false;
		int charPos=word.charAt(0)-'a';
		
		if(this.children[charPos]==null){
			this.children[charPos]=new TrieNode(word.charAt(0));
			this.children[charPos].parent=this;
		}
		
		if(word.length()>1)
			this.children[charPos].addWord(word.substring(1));
		else
			this.children[charPos].isEndOfWord=true;
	}
	
	//Get the next level of node that match the prefix element, used for recursion:
	protected TrieNode getNode(char match){
		return this.children[match-'a'];
	}
	
	//detect if a node is end of a word, then add and go deeper:
	protected List getWords(List list){
		if(this.isEndOfWord)
			list.add(this.toString());
		
		if(!this.isLeaf){
			for(int i=0; i<26; i++){
				if(this.children[i]!=null)
					this.children[i].getWords(list);
			}
		}
		return list;
	}
	
	@Override
	public String toString(){
		if(this.parent==null)//it's the root:
			return "";
		else
			return parent.toString()+new String(new char[]{value});
	}	
}
