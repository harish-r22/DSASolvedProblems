//Flood fill algorithm


public class Solution{
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
		int inicolor=image[sr][sc];
		int [][] ans= image;
		int delrow [] ={-1,0,1,0};
        int delcol[]={0,+1,0,-1};
        dfs(sr,sc, ans, newColor,image, inicolor,delrow,delcol);
        return ans; 		
	}
	
	
	private void dfs(int row, int col, int[][] ans, int newColor, int [][] image, int inicolor, int [] delrow, int [] delcol){
		ans[row][col]=newColor;
		int n=image.length;
		int m=image[0].length;
		for(int i=0;i<4;i++){
			int nrow=row+delrow[i];
			int ncol=col+delcol[i];
			if(nrow>=0 && ncol < n && ncol >=0 && ncol<n && image[nrow][ncol]==inicolor && image[nrow][ncol]!=newColor ){
				dfs(nrow,ncol,ans, newColor,image,inicolor,delrow,delcol);
			}
		}
	}
}