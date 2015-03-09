package DataStructure.Trie;

import java.util.List;

public class Test {
	public static void main(String[] args){
		Trie tree=new Trie();
		tree.addWord("china");
		tree.addWord("chicken");
		tree.addWord("chinese");
		tree.addWord("chill");
		List<String> resList=tree.getWords("chi");
		for (String value : resList) {
		    System.out.println(value);
		}
	}
}
