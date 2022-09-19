//Rotten oranges

public class Pair{
	int row;
	int col; 
	int tm;
	public Pair(int row, int col, int tm){
		this.row=row;
		this.col=col;
		this.tm=tm;
	}
}

public class Solution{
	
	public int orangesRotting(int [][] grid){
		int n = grid.length;
		int m= grid[0].length;
		Queue<Pair> queue= new LinkedList<>();
		int vis[][]= new int [n][m];
		int cntFresh=0
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==2){
					queue.add(new Pair(i,j),0);
					vis[i][j]=2;
				}else{
					cntFresh++;
					vis[i][j]=0;
				}
			}
		}
		
		int tm=0;
		int drow[]={-1,0,+1,0};
		int dcol[]={0,1,0,-1};
		int count=0
		while(!queue.isEmpty()){
			int r=queue.peek().row;
			int c=queue.peek().col;
			int t=queue.peek().tm;
			tm=Math.max(tm,t);
			queue.remove();
			for(int i=0;i<4;i++){
				int nrow=r+drow[i];
				int ncol=c+dcol[i];
				if(nrow>=0 && ncol< n  && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
					queue.add(new Pair(nrow,ncol,t+1));
					vis[nrow][ncol]=2
					count++;
				}
			}
		}
		if(count!=cntFresh)return -1;
		return tm;
	}
}