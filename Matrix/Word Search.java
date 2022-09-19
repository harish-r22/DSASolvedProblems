//. Word Search

public class Solution{
	public boolean wordSearch(char [][] board, String word){
		if(board.length==0){
			return false;
		}
		int rows=board.length;
		int col=board[0].length;
		char[] array= word.toCharArray();
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				if(dfs(board,array,0,i,j)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean dfs(char[][] board, char[] array, int index,int row, int col){
		if(row<0 || row> board.length || col < 0 || col > board[0].length){
			return false;
		}
		if(array[index]!=board[row][col]){
			return false;
		}
		if(index== array.length){
			return true;
		}
		
		board[row][col]-=65;
		
		boolean found = (dfs(board,array,index+1,row+1,col)
		|| dfs(board,array,index+1,row-1,col)
		|| dfs(board,array,index+1,row,col-1)
		|| dfs(board,array,index+1,row,col+1));
		
		board[row][col]+=65;
		
		return found;
	}
}