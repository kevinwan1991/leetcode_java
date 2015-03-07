package BFS.WordLadder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        HashSet<String> existed=new HashSet<String>();
        Queue<String> queue=new LinkedList<String>();
        
        int step=1;
        int curr=1;
        int next=0;
        queue.offer(start);
        existed.add(start);
        while(!queue.isEmpty()){
        	String node=queue.poll();
        	curr--;
        	
        	for(int i=0; i<node.length(); i++){
        		char[] arr=node.toCharArray();
        		
        		for(char j='a'; j<='z'; j++){
        			arr[i]=j;
        			String child=new String(arr);
        			if(end.equals(child))
        				return step+1;
        			if(dict.contains(child) && !existed.contains(child)){
        				queue.offer(child);
        				existed.add(child);
        				next++;
        			}
        		}
        	}
        	if(curr==0){
        		curr=next;
        		next=0;
        		step++;
        	}
        }
        return 0;
    }
}