//Number of Distinct islands

public class Solution{
	
	public String toString(int r, int c){
		return Integer.toString(r) + " " + Integer.toString(c);
	}
	
	public void dfs(int row, int col, int [][] visited, ArrayList<String> vec, int row0, int col0, int [][] grid){
		visited[row][col]=1;
		vec.add(toString(row-row0 , col-col0));
		int n= grid.length;
		int m=grid[0].length;
		int delrow[]={-1,0,1,0};
		int delcol[]={0,1,0,-1};
		
		for(int i=0;i<4;i++){
			int nrow=row+delrow[i];
			int ncol=col+delcol[i];
			if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
				dfs(nrow,ncol,visited,vec, row0,col0,grid);
				
			}
		}
		
	}
	
	public int getNumberOfIsland(int [][] grid){
		int n=grid.length;
		int m=grid[0].length;
		HashSet<ArrayList<String>> island= new HashSet<>();
		int [][] visited= new int[n][m];
		 
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==1 && visited[i][j]==0){
					ArrayList<String> vec= new ArrayList<>();
						dfs(i,j,visited,island,vec,i,j,grid);
						island.add(vec);
					}
				
			}
		}
		
		return island.size();
		
	}
}