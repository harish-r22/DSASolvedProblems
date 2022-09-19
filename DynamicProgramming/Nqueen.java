//Nqueen

public class Solution{
	
	public List<List<String>> solveNqueen(int n){
		List<List<String>> ans = new ArrayList<>();
		char [][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
		solve(0,board,ans,n);
		return ans;
	}
	
	public void solve(int col, char[][] board ,List<List<String>> ans, int n){
		if(col==n){
			ans.add(constructRes(board) );
		}
		for(int row=0;row<n;row++){
			if(isSafe(row,col,board,n)){
				board[row][col]='Q';
				solve(col+1,board,ans,n);
				board[row][col]='.';
			}
		}
			
	}
	
	public boolean isSafe(int row, int col, char[][] board, int n){
		int duprow=row;
		int dupcol=col;
		
		while(row>=0 && col > =0 ){
			if(board[row][col]=='Q')
				return false;
			row--;
			col--;
		}
		
		row=duprow;
		col=dupcol;
		
		while(row<n && col > =0){
			if(board[row][col]=='Q')
				return false;
			row++;
			col--;
		}
		
		row=duprow;
		col=dupcol;
		
		while(col > =0){
			if(board[row][col]=='Q')
				return false;
			col--;
		}
		return true;
	}
	
	
	public List<String> constructRes(char[][] board){
		List<String> ans= new ArrayList<>();
		for(int i=0;i<board.length;i++){
			String str= new String(board[i]);
			ans.add(str);
		}
		return ans;
	}

}

time complexcity : o(n*n + 3n)
space complexcity : o(1)

--------------------------------

public class SOlution{
	public List<List<String>> solveNqueen(int n){
		List<List<String>> ans = new ArrayList<>();
		char [][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
		int leftRow [] = new int[n];
		int upperdiagonal [] = new int[2*n-1];
		int lowerdiagonal[]= new int[2*n-1];
		solve(0,board,ans,n,leftRow,upperdiagonal,lowerdiagonal);
		return ans;
	}
	
	public void solve(int col, char[][] board ,List<List<String>> ans, int n
	int[] leftRow, int[] upperdiagonal, int [] lowerdiagonal){
		if(col==n){
			ans.add(constructRes(board) );
		}
		for(int row=0;row<n;row++){
			if( leftRow[row]==0 && upperdiagonal[n-1+col-row]==0 && lowerdiagonal[row+col]==0){
				leftRow[row]=1;
				upperdiagonal[n-1+col-row]=1;
				lowerdiagonal[row+col]=1;
				board[row][col]='Q';
				solve(col+1,board,ans,n);
				board[row][col]='.';
				leftRow[row]=0;
				upperdiagonal[n-1+col-row]=0;
				lowerdiagonal[row+col]=0;
			}
		}
			
	}
	
	public List<String> constructRes(char[][] board){
		List<String> ans= new ArrayList<>();
		for(int i=0;i<board.length;i++){
			String str= new String(board[i]);
			ans.add(str);
		}
		return ans;
	}
}


time complexcity : o(n*n )
space complexcity : o(1)