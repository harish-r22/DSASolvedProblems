//Flood fill algorithm

public class Solution{
	
	public int[][] floodFill(int [][] image, int sr, int sc, int newColor){
		int n=image.length;
		int answer[][]=image;
		int m=image[0].length;
		int initialColor=image[sr][sc];
		int delRow[]={-1,0,1,0};
		int delCol[]={0,1,0,-1};
		dfs(sr,sc,image,initialColor,answer,newColor,delRow,delCol);
		return ans;
	}
	
	public void dfs(int row, int col, int [][] image, int initialColor, int [][] answer, int newColor int [] delRow, int [] delCol){
		ans[row][col]=newColor;
		int n=image.length;
		itn m=image[0].length;
		
		for(int i=0;i< 4;i++){
			
			int nrow=row+delRow[i];
			int ncol=col+delCol[i];
			if(nrow>=0 && nrow<n && ncol >=0 && ncol< m && image[nrow][ncol]==initialColor && ans[row][col]!=newColor){
				dfs(nrow,ncol,image,initialColor,answer,newColor,delRow,delCol);
			}
			
		}
		
	}
}