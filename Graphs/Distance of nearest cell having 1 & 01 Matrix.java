//Distance of nearest cell having 1 | 0/1 Matrix


public class Node{
	int first;
	int secound;
	int steps;
	public Node(inr first, int secound, int steps){
		this.first=first;
		this.secound=secound;
		this.steps=steps;
	}
	
}

public class Solution{
	
	public int[][] checkNearestCell(int [][] grid){
		int n= grid.length;
		int m=grid[0].length;
		int vis[][] = new int[n][m];
		int dist[][]=new int[n][m];
		Queue<Node> queue= new LinkedList<>();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==1){
					queue.add(new Node(i,j,0))
					vis[i][j]=1;
				}else{
					vis[i][j]=0;
				}
			}
		}
		
		int delrow[]={-1,0,1,0};
		int delcol[]={0,+1,0,-1};
		
		while(!queue.isEmpty()){
			int row=queue.peek().first;
			int col=queue.peek().secound;
			int steps=queue.peek.steps;
			queue.remove();
			dist[row][col]=steps;
			for(int i=0;i<4;i++){
				int nrow=row+delrow[i];
				int ncol=col+delcol[i];
				if(nrow >=0 && nrow< n && ncol >=0 ncol<m && vis[n][m]==0){
						vis[nrow][ncol]=1;
						queue.add(new Node(nrow,ncol,steps+1));
				}
			}
		}
		return dist;
	}
}