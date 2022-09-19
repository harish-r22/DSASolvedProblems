//Bipertite Graph

public class Solution{
	
	public boolean check(int start,ArrayList<ArrayList<Integer>> adj, int color[], int v){
		Queue<Integer> queue= new LinkedList<>();
		queue.add(start);
		color[start]=0;
		while(!queue.isEpmty()){
			int node=queue.peek();
			queue.remove();
			for(int it : adj.get(node)){
				if(color[it]==-1){
					color[it]=1-color[node];
					queue.add(it);
				}else if(color[it]==color[node]){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isBipartite(int v,  ArrayList<ArrayList<Integer>> adj){
		int color[] = new int[v];
		for(int i=0;i<v;i++){
			color[i]=-1;
		}
		
		for(int i=0;i<v;i++){
			if(color[i]=-1){
				if(check(i,adj, color,v)==false){
					return false;
				}
			}
		}
		return true;
		
	}
}