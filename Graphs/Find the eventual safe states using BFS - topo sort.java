//Find the eventual safe states using BFS - topo sort

public class Solution{
	
	public List<Integer> eventualSafeStated(int v , List<List<Integer>> adjList){
		
		
		List<List<Integer>> revList= new ArrayList<Integer>();
		int [] indegree= new int[v];
		for(int i=0;i<v;i++){
			revlist.add(new ArrayList<>());
		}
		
		//i->itr
		//itr->i
		for(int i=0;i<v;i++){
			for(int itr : adjList){
				revList.get(itr).add(i);
				indegree[i]++;
			}	
		}
		
		
		Queue<Integer> queue= new Queue<>();
		
		for(int i=0;i<v;i++){
			if(indegree[i]==0)
			queue.add(i);
		}
		List<Integer> safeNodes= new ArrayList<>();
		while(!queue.isEmpty()){
			int node = queue.peek();
			queue.pop();
			safeNodes.add(node);
			for(int itr : revList.get(node)){
				indegree[itr]--;
				if(indegree[itr]==0){
					queue.add(itr);
				}
			}
		}
		Collections.sort(safeNodes);
		return safeNodes;
	}		
	
}