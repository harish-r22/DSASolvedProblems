// number of provinces

public class Solution{
	
	public static void dfs(int vertex, int [] visited,List<List<Integer>> ajdList){
		visited[vertex]=1;
		for(Integer  itr : ajdList.get(vertex)){
			if(visited[it]==0){
				dfs(itr,visited,ajdList);
			}
		}
		
	}
	
	public static int numberOfProvinces(int [][] matrix , int v){
		List<List<Integer>> ajdList = new ArrayList<>();
		for(int i=0;i<v;i++){
			ajdList.add(new ArrayList<Integer>());
		}
		
		for(int row=0;row<matrix.length;row++){
			for(int col=0;col<matrix[0].length;col++){
				if(matrix[row][col]==1 && row!=col){
					ajdList.get(row).add(col);
					ajdList.get(col).add(row);
		    	}
			}
		}
		
		int visited [] = new int[v];
		int count=0;
		for(int i=0;i<v;i++){
			if(visited[i]==0){
				count++;
				dfs( i, visited, ajdList);
			}
		}
		return count;
	}
}

time complexcity : o(n2)
space complexcity : o(n)