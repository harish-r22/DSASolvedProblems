// course shedule 1 | 2


public class Solution{
	public boolean isPossible(int [][] prerequisites, int N){
		ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
		for(int i=0;i<N;i++){
			adj.add(new ArrayList<Integer>());
		}
		int n=prerequisites.length;
		for(int i=0;i<n;i++){
			adj.get(prerequisites[i][0].add(prerequisites[i][1]));
		}
		
		int [] indegree= new int[N];
		for(int i=0;i<N;i++){
			for(int itr : adj.get(i)){
			indegree[itr]++;
			}
		}
		
		Queue<Inetege> queue= new Queue<>();
		
		for(int i=0;i<N;i++){
			if(indegree[i]==0){
				queue.add(i);
			}
		}
		int count=0;
		int [] topo= new int[N];
		while(!queue.isEmpty()){
			int node=queue.peek();
			queue.poll();
			topo[count++]=node;
			for(int it: adj.get(node)){
				indegree[it]--;
				if(indegree[it]==0){
					queue.add(it);
				}
			}
		}
		if(count==N){
			return true;
		}
		return false;
	}
	
}