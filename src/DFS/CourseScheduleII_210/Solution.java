package DFS.CourseScheduleII_210;

public class Solution {
	private int cur;
	private int[] res;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	res=new int[numCourses];
    	for(int i=0; i<numCourses; i++)
    		res[i]=i;
    	
    	if(prerequisites==null || prerequisites.length==0)
    		return res;
    	
    	int[][] map=new int[numCourses][numCourses];
        int[] visited=new int[numCourses];//0 for non-visited,1 for visiting,2 for visited!
        
        for(int i=0; i<prerequisites.length; i++)
        	map[prerequisites[i][1]][prerequisites[i][0]]=1;
        
        cur=numCourses-1;
        for(int node=0; node<visited.length; node++){
        	if(visited[node]==0){
        		if(!dfs(map,visited,node))
        			return new int[0];
        		else
        			continue;
        	}
        }
        return res;
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
    	res[cur--]=node;
    	return true;
    }
}