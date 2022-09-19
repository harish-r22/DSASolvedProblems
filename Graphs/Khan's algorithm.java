//Khan's algorithm

public class solution{
	public int[] toposort(int v, List<List<Integer>> adj){
		int [] visited = new int[v];
		int [] indegreee[] = new int[v];
		for(int i=0;i<v;i++){
			for(int it : adj.get(i)){
				indegreee[it]++;
			}
		}
		
		Queue<Integer> queue= new Queue<>();
		for(int i=0;i<v;i++){
			if(indegreee[i]==0){
				queue.add(i);
			}
		}
		int [] topo= new int[v];
         int i=0;   		
		
		while(!queue.isEmpty()){
			int node=queue.peek();
			queue.poll();
			topo[i++]=node;
			for(int it : adj.get(node)){
			  indegreee[it]--;
              if(indegreee[it]==0){
				  queue.add(it);
			  }				  
			}
		}
	}		
	
}