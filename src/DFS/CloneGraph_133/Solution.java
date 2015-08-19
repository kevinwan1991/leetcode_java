package DFS.CloneGraph_133;

import java.util.HashMap;

public class Solution {
    
    private HashMap<UndirectedGraphNode,UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null)
            return null;
        
        map=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        UndirectedGraphNode node1=new UndirectedGraphNode(node.label);
        map.put(node,node1);
        
        helper(node);
        return node1;
    }
    
    public void helper(UndirectedGraphNode node){
        if(node==null)
            return;
            
        for(UndirectedGraphNode subNode:node.neighbors){
            UndirectedGraphNode subNode1=null;
            
            if(!map.containsKey(subNode)){
                subNode1=new UndirectedGraphNode(subNode.label);
                map.put(subNode,subNode1);
                
                //Must put recursion here: after in map, no recursion anymore,but still allow adding other edges!!!
                helper(subNode);
            }else{
                subNode1=map.get(subNode);
                
            }
            map.get(node).neighbors.add(subNode1);
        }
    }
}