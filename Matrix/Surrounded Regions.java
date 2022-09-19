//Surrounded Regions

//Given a matrix of ‘O’ and ‘X’, replace ‘O’ with ‘X’ if surrounded by ‘X’

public class Solution{
	boolean seen =false;
	public void Solve(char[][] board){
		int row= board.length;
		if(row<=1){
			return;
		}
		int col=board[0].length;
		if(col<=1){
			return;
		}
		boolean [][] visited= new boolean[row][col];
		for(int i=1;i<row-1;i++){
			for(int j=1;j<col-1;j++){
				if(board[i][j]=='0' && !visited[i][j]){
					seen =false;
					dfs(board, i,j,visited,row, col);
					if(seen == false){
						mark(board, i,j,visited,row, col);
						seen =true;
					}
				}
			}
		}
	}
	
	public void dfs(char[][] board, int row , int col, boolean[][] visited, int n, int m){
		if(row<0 || row> n-1 || col < 0 || col > m-1){
			return;
		}
		if(board[row][col]=='x' || visited[row][col]){
			return;
		}
		if(row<=0 || row>=n-1 || col <= 0 || col>=m-1){
			seen=true;
		}
		visited[row][col]=true;
		dfs(board,row+1, col,visited,int n, int m);
		dfs(board,row-1,col,visited,int n, int m);
		dfs(board,row,col-1,visited,int n , int m);
		dfs(board,row,col+1,visited,int n, int m);
		
	}
	
	public void mark(char[][] board, int row, int col,boolean[][] visited, int n, int m){
		if(row<0 || row>n-1 || col<0 || col>m-1){
			return;
		}
		if(visited[row][col]=='x'){
			return;
		}
		board[i][j]='x';
		dfs(board,row+1, col,visited,int n, int m);
		dfs(board,row-1,col,visited,int n, int m);
		dfs(board,row,col-1,visited,int n , int m);
		dfs(board,row,col+1,visited,int n, int m);
	}
}

