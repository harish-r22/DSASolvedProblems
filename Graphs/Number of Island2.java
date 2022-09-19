//Graph

//Number of islands

public class Pair{
	int first;
	int second;
	public Pair(int first, int second){
		this.first=first;
		this.second=second;
	}
}

public class Solution{
	
	public void bfs(int row, int col, boolean[][] visited, char [][] grid){
		visited[row][col]=1;
		Queue<Pair> queue= new LinkedList<>();
		queue.add(new Pair(row,col));
		int n=grid.length;
		int m=grid[0].length;
		
		while(!queue.isEmpty()){
			int row=queue.peek().first;
			int col=queue.peek().secound;
			queue.remove();
			
			for(int delrow=-1; delrow<=1;delrow++){
				for(int delcol=-1;delcol<=1;delcol++){
					int nrow=row+delrow;
					int ncol=col+delcol;
					
					if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && visited[nrow][ncol]==0){
						visited[nrow][ncol]==1;
						queue.add(new Pair(nrow,ncol));
					}
					
				}
			}
			
		}
	}
	
	public int numISlands(char [][] matrix){
		int n=matrix.length;
		int m=matrix[0].length;
		int count=0;
		int [][] visited = new int[n][m];
		for(int row=0;row<n;row++){
			for(int col=0;col<m;col++){
				if(visited[i][j]==0 && matrix[row][col]== '1'){
					count++;
					bfs(row,col,visited,matrix);
				}
			}
		}
		
		return count;
	}
}


time complexcity : n2 + n2*9 =n2


space complexcity :o(n2) + o(n2)