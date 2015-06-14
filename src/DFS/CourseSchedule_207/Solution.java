package DFS.CourseSchedule_207;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //if(prerequisites==null ||prerequisites.length==0 ||prerequisites[0].length==0)
        //	return false;
        
        int[][] map=new int[numCourses][numCourses];
        //if a node is checked in a loop, no need next time!
        int[] visited=new int[numCourses];//0 for non-visited,1 for visiting,2 for visited!
        //if data structure not suitable, change it!!!
        for(int i=0; i<prerequisites.length; i++)
        	map[prerequisites[i][1]][prerequisites[i][0]]=1;
        
        for(int node=0; node<visited.length; node++){
        	if(visited[node]==0){
        		if(dfs(map,visited,node)==false)
        			return false;
        	}
        }
        return true;
    }
    
    public boolean dfs(int[][] map, int[] visited, int node){
    	visited[node]=1;//first time visit!
    	for(int otherNode=0; otherNode<map[0].length; otherNode++){
    		if(map[node][otherNode]==1){
    			if(visited[otherNode]==1)
    				return false;
    			if(visited[otherNode]==0 && !dfs(map,visited,otherNode))
    				return false;
    		}
    	}
    	visited[node]=2;//second time visit!
    	return true;
    }
}