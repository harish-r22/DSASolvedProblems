//Shortest Path in Undirected Graph with Unit Weights

public class Solution{
	public int[] shortesPath(int N, int M, int [][] edges , int src){
		ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
		for(int i=0;i<N;i++){
			adj.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++){
			adj.get(edges[i][0]).add(edges[i][1]);
			adj.get(edges[i][1]).add(edges[i][0]);
		}
		int dist[] = new int[N];
		for(int i=0;i<N;i++){
			dist[i]=(int)1e9;
		}
		dist[src]=0;
		Queue<Integer> queue= new LinkedList<>();
		queue.add(src);
		while(!queue.isEmpty()){
			int node =queue.peek();
			queue.remove();
			for(int it : adj.get(node)){
				if(dist[node] +1 < dist[it]){
					dist[it]=1+dist[node];
					queue.add(it);
				}
			}
			
		}
		
		for(int i=0;i<n;i++){
			if(dist[i]==(int)1e9){
				dist[i]=-1;
			}
		}
		return dist;
	}
}