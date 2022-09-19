//Detect cycle in directed graph


public class Solution{
	
	public boolean dfs(int node,in [] visited, int [] pathVis, List<List<Integer>> adj){
		visited[node]=1;
		pathVis[node]=1;
		
		for(int it : adj.get(node)){
			if(visited[it]==0){
				if(dfs(node,visited,pathVis,adj)==true)
					return true;
			}else if(pathVis[it]==1){
				return true;
			}
		}
		pathVis[node]=0;
		return false;
		
	}
	
	public boolean checkCycle(List<List<Integer>> adj , int v){
		int [] visited = new int[v];
		int [] pathVis = new int[v];
		
		for(int i=0;i<v;i++){
			if(visited[i]==0){
				if(dfs(i,visited, pathVis, adj)==true){
					return true;
				}
			}
		}
		return false;
	}
}
