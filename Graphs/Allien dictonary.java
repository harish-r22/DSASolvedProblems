//Allien dictonary


public class Solution{
	
	
	public List<Integer> getToposort(int v, ArrayList<ArrayList<Intger>> adj){
		int [] indegree= new int [v];
        for(int i=0;i<v;i++){
			for(int itr : adj.get(v)){
				indegree[itr]++;
			}
		}
       Queue<Integer> queue= new LinkedList();
	    for(int i=0;i<v;i++){
			
			if(indegree[i]==0){
				queue.add(i);
			}
		}
		
		List<Integer> topo= new ArrayList<>;
		while(!queue.isEmpty()){
			int node = queue.peek();
			queue.poll();
			topo.add(node);
			
			for(int itr : adj.get(node)){
				indegree[itr]--;
				if(indegree[itr]==0){
					queue.add(itr);
				}
			}
		}
       		
		return toposort;
	}
	
	public String findOrder(String [] dict , int N , int k){
		ArrayList<ArrayList<Intger>> adj = new ArrayList<>();
		
		for(int i=0;i<N;i++){
			adj.add(new ArrayList<>());
		}
		
		for(int i=0;i<N-1;i++){
			String s1=dict[i];
			String s2=dict[i+1];
			int len=Math.min(s1.length() , s2.length());
			
			for(int ptr=0;ptr<len;ptr++){
				if(s1.charAt(ptr)==s2.chatAt(ptr)){
					adj.get(s1.charAt(ptr)-'a').add(s2.charAt(ptr)-'a');
					break;
				}
			}
		}
		
		List<Integer> toposort = getToposort( N,  adj); 
		String and="";
		for(int itr : toposort){
			ans= ans + (char) (itr+ (int)'a');
		}
		return ans;
	}
}