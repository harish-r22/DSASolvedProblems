

//Surrounded region | replace 0's with x's


public class Solution{
	
	
	
	public void dfs(int row, int col, int [][] vis, int [] delrow, int [] delcol, char[][] mat){
		vis[row][col]=1;
		int n=mat.length;
		int m=mat[0].length;
		for(int i=0;i<4;i++){
			int nrow=row+delrow[i];
			int ncol=col+delcol[i];
			if(nrow>=0 && nrow <n && ncol>=0 && ncol< m && vis[nrow][ncol]=0 && mat[nrow][ncol]=='0'){
				dfs(nrow,ncol,vis,delrow,delcol,mat);
				
			}
		}
		
	}
	
	public char[][] fill(int n , int m , char[][] mat[][]){
		int delrow[]={-1,0,+1,0};
	    int delcol[]={ 0,1,0 -1};
		int vis[][] = new int[n][m];
		
		for(int i=0;i<m;i++){
			if(mat[0][i] ==' 0' && vis[0][i]==0){
				dfs(0,i,vis,delrow,delcol,mat)
			}
			
			if(mat[n-1][i]=='0' && vis[n-1][i]==0){
				dfs(0,i,vis,delrow,delcol,mat)
			}
		}
	    
		
		for(int i=0;i<n;i++){
			if(mat[i][0] == '0' && vis[i][0]==0){
				dfs(0,i,vis,delrow,delcol,mat)
			}
			
			if(mat[i][m-1]=='0' && vis[i][m-1]==0){
				dfs(0,i,vis,delrow,delcol,mat)
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat[i][j]=='0' && vis[i][j]==0){
					mat[i][j]='x';
				}
			}
			
		}
	
		
	}
}