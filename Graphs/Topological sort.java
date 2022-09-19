//Topological sort


public class Solution{
	public void dfs(int node , int[] visited, Stack<Integer> stack, List<List<Integer>> adj){
		vis[node]=1;
		for(int it: adj.get(node)){
			if(vis[it]==0){
				dfs(it, vis, stack,adj);
			}
		}
		stack.push(node);
	}
	
	public int[] topoSort(int v , int List<List<Integer>> adj){
		int vis[] = new int [v];
		Stack<Integer> stack= new Stack<>();
		for(int i=0;i<v;i++){
			if(vis[i]==0){
				dfs(i, vis, stack, adj);
			}
		}
		
		int [] ans= new int[v];
		int i=0;
		while(!stack.isEmpty()){
			ans[i++]=stack.peek();
			stack.pop();
		}
		return ans;
	}
	
}