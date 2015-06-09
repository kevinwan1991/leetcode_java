package Trie.ImplementTrie_208;
import java.util.HashMap;

public class TrieNode {
    public char var;
    public boolean isEnd=false;
    HashMap<Character,TrieNode> map=new HashMap<Character,TrieNode>(); 
    
    public TrieNode() {}
    public TrieNode(char var){
    	this.var=var;
    }
}
