//Number of Enclaves


public class Solution{
	
	public int numberOfEnclaves(int [][] grid){
		Queue<Pair> queue= new LinkedList<>();
		int n=grid.length;
		int m= grid[0].length;
		int [][] visited= new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i==0 || j==0 || i==n-1 || j==m-1){
					if(grid[i][j]==1){
						queue.add(new Pair(i,j));
						visited[i][j]=1;
					}else{
						visited[i][j]=0;
					}
				}
			}
		}
		
		int delrow[]={-1,0,+1,0};
		int delcol[]={0,1,0,-1};
		while(!queue.isEmpty()){
			int row=queue.peek().first;
			int col=queue.peek().secound;
			queue.remove();
			for(int i=0;i<4;i++){
				int nrow=row+delrow[i];
				int ncol=col+delcol[i];
			    if(nrow >=0 && nrow<n && ncol >=0 && ncol<m && visited[nrow][ncol]==0){
					visited[nrow][ncol]=1;
					queue.add(new Pair(nrow,ncol));
			    }
		    }
		}
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(visited[i][j]==0 && grid[i][j]==1){
					count++;
				}
			}
		}
		return count;
	}
}