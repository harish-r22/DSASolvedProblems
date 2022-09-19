//m colour 

public class Solution{
	
	public static boolean isSafe(int node,List<Integer>[] graph,int [] color,int n , int col){
		for(int it : graph[node]){
			if(color[it]==col)
				return false;
		}
		return true;
	}
	
	public boolean solve(int node,List<Integer>[] graph,int[] color, int n,int m){
		if(node==n)
			return true;
		
		for(int i=1;i<=m;i++){
			if(isSafe(node,graph,color,n,i)){
				color[node]=i;
				if(solve(node+1,graph,color,n,m)==true)
					return true;
				color[node]=0;
			}
				
		}
		return false;
	}
	
	public boolean graphColouring(List<Integer> [] graph, int m){
		int n=graph.length;
		int color[] = new color[n];
		if(solve(1,graph,color,n,m)==true)
			return true;
		return false;
	}
}