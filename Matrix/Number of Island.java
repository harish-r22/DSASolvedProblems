// Number of Island


public class Solution{
	public int getCountOfIslands(int [][] matrix){
		int m=matrix.length;
		int num=0;
		int n=matrix[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==1){
					num +=dfs(matrix,i,j);
				}
			}
		}
		
		return num;
	}
	public int dfs(int [][] matrix, int row, int col){
		if(row<0 || row> =matrix.length || col >= matrix[0].length || col<0 || matrix[row][col]==0){
			return 0;
		}
		
	matrix[row][col]=0;
	dfs(matrix,row+1,col);
	dfs(matrix,row-1,col);
	dfs(matrix,row,col+1);
	dfs(matrix,row,col-1);
	return 1;
	}
}