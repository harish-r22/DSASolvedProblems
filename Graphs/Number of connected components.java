Number of connected components


public class Solution{
	
	public void bfs(int row, int col, int [][] visited, int [][] grid){
		visited[row][col]=1;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(row, col));
		int n=grid.length;
		int m=grid[0].length;
		while(!queue.isEmpty()){
			int ro=queue.peek().first();
			int co=queue.peek().secound();
			queue.poll();
			
			for(int delrow=-1;delrow<=1 ;delrow++){
				
				for(int delcol=-1;delcol<=1;delcol++){
					int nrow=delcol+ro;
					int ncol=delcol+co;
					
					if(nrow >=0 && nrow < n && ncol >=0 && ncol <m && visited[nrow][nrow]==0 && grid[nrow][ncol]==1){
						queue.add(new Pair(nrow,ncol));
					}
					
				}
			}
			
		}
		
	}
	
	public int getNumberOfIsland(int [][] grid){
		int n=grid.length;
		int m=grid[0].length;
		int count=0;
		int [][] visited = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(visited[i][j]==0 && grid[i][j]==1){
					count++;
					bfs(i,j,visited, grid);
					
				}
				
			}
		}
		return count;
		
	}
}