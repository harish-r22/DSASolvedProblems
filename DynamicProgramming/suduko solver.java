// suduko solver

public class Solution{
	public boolean isValidSudoko(char [][] board){
		if(board ==null || board.length==0){
			return false;
		}
		return solve(board);
	}
	
	public boolean solve(char [][] board){
        int i,j=0;		
		int m=board.length;
		int n=board[0].length;
		boolean isTherapycell=false;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(board[i][j]=='.'){
					isTherapycell=true;
					i=m;
					j=n;
				}
			}
		}
		if(!isTherapycell)
			return true;
		
		for(char c ='1' ; c<='9';c++){
			if(isValid(board,i,j,c)){
				board[i][j]=c;
				if(solve(board))
					return true;
				else
				board[i][j]='.'; 	
			}
		}
		return false;
	}
	
	public boolean isValid(char [][] board, int row, int col,char c){
		for(i=0;i<9;i++){
			if(board[i][col]==c)
				return false;
			
			if(board[row][i]==c)
				return false;
			
			if(board[3* (row/3) + i/3 ][3* (col/3) + i%3]!='.' && board[3*(row/3)+ i/3][3*(col/3)+i%3] == c)
				return false;
		}
		return true;
	}
}



time complexcity : o(n*m + n)
space complexcity :o(1)