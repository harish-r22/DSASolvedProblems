//Find the Eventual safe nodes

public class Solution{
	
	
	public boolean dfs(int node, int[] visited,List<List<Integer>> adj int [] pathvis, int [] check){
		visited[node]=1;
		pathvis[node]=1;
		
		for(int it : adj.get(node)){
			if(visited[it]==0){
				if(dfs(it,visited,adj,pathvis,check)==true){
					return true;
				}
			}else if(pathvis[it]==1){
				return true;
			}
		}
		pathvis[node]=0;
		check[node]=1;
		return false;
	}
	
	 public List<Integer> getSafeNodes(List<List<Integer>> list, int v){
		 int[] visited= new int[v];
		 int [] pathvis= new int[v];
		 int[] check= new int[v];
		 
		 for(int i=0;i<v;i++){
			 if(visited[i]==0){
				 dfs(i, visited,list,pathvis,check);
			 }
		 }
		 List<Integer> safetNodes= new ArrayList<>();
		 for(int i=0;i<v;i++ ){
			 if(check[i]==1){
				 safetNodes.add(i);
			 }
		 }
		 return safetNodes;
		 
	 }
}