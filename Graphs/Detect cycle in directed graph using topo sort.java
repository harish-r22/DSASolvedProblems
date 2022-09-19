//Detect cycle in directed graph using topo sort


public class Solution{
	public boolean topoSort(int v ,List<List<Integer>> adj){
		int [] indegree= new int [v];
		Queue<Integer> queue= new Queue<>();
		for(int i=0;i<v;i++){
			for(int itr: adj.get(i)){
				indegree[i]++;
			}
		}
		
		for(int i=0;i<v;i++){
			if(indegree[i]==0){
				queue.add(i);
			}
		}
		
		int [] topo= new int [v];
		int count=0;
		while(!queue.isEmpty()){
			int node=queue.peek();
			topo[count++]=node;
			for(int itr : adj.get(node)){
				indegree[itr]--;
				if(indegree[itr]==0){
					queue.add(itr)
				}
			}
			
		}
		
		if(count==v){
			return false;
		}
		return true;
	}
	
}