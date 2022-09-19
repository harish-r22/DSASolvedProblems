//Shortest Path in Directed Acyclic graph

public class Solution{
	
	public void toposort(int node, int [] visited, ArrayList<ArrayList<Pair>> adj,Stack<Integer> stack){
		visited[node]=1;
		for(int i=0;i<adj.get(node).size();i++){
			int v =adj.get(node).get(i).first;
			if(visited[v]==0){
				toposort(v, visited, adj, stack);
			}	
		}
		stack.push(node);
	}
	public int[] shortestPath(int N , int M, int [][] edges, int src){
		ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
		for(int i=0;i<N;i++){
			ArrayList<Pair> list= new ArrayList<>();
			adj.add(list);
		}
		
		for(int i=0;i<M;i++){
			int u=edges[i][0];
			int v=edges[i][1];
			int weight=edges[i][2];
			adj.get(i).add(new Pair(v,weight));
		}
		Stack<Integer> stack= new Stack<>();
        int [] visited = new int[N];
        for(int i=0;i<N;i++){
			if(visited[i]==0){
				toposort(i,visited,adj,stack);
			}
		}			
        		
		int [] dist = new int[N];
		for(int i=0;i<N;i++){
			dist[i]=(int)(1e9);
		}
		dist[scr]=0;
		while(!stack.isEmpty()){
			int node =stack.peek();
			stack.pop();
			
			for(int i=0;i<adj.get(node).size();i++){
				int v =adj.get(node).get(i).first;
				int wt= adj.get(node).get(i).secound;
			    if(dist[node] + wt < dist[v]){
					dist[v]=wt+dist[node];
				}					
				
			}
		}
		
		return dist;
	}
	
}