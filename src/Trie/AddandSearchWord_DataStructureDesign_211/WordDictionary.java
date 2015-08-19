package Trie.AddandSearchWord_DataStructureDesign_211;

import java.util.HashMap;
import java.util.Set;

public class WordDictionary {
    private Trie dic=new Trie();
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        this.dic.insert(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return this.dic.search(word);
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if(word==null || word.length()==0)
            return;
        
        char[] arr=word.toCharArray();
        TrieNode node=this.root;
        
        for(int i=0; i<arr.length; i++){
            char tmp=arr[i];
            if(!node.map.containsKey(tmp)){
                node.map.put(tmp,new TrieNode(tmp));
            }
            node=node.map.get(tmp);
            if(i==arr.length-1)
                node.isEnd=true;
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(word==null || word.length()==0)
            return false;
            
        return helper(this.root,word);
    }
    
    public boolean helper(TrieNode node,String word){
        if(word==null || word.length()==0){
            return node.isEnd?true:false;
        }
        
        char tmp=word.charAt(0);
        if(tmp=='.'){
            Set<Character> keys=node.map.keySet();
            for(char key:keys){
                TrieNode tmpNode=node.map.get(key);
                if(helper(tmpNode,word.substring(1)))
                    return true;
            }
        }else{
            if(!node.map.containsKey(tmp))
                return false;
            else
                return helper(node.map.get(tmp),word.substring(1));
        }
        return false;
    }
}

class TrieNode {
    public char var;
    public boolean isEnd=false;
    HashMap<Character,TrieNode> map=new HashMap<Character,TrieNode>(); 
    
    public TrieNode(){}
    
    public TrieNode(char var){
    	this.var=var;
    }
}
