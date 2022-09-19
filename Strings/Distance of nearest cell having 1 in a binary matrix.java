//Distance of nearest cell having 1 in a binary matrix

public class Solution{
	public ans[][] printDistance(int [][] matrix){
		 int n=matrix.length;
		int m=matrix[0].length;
		int ans[][] = new int[n][m];
     
        // Initialize the answer matrix with INT_MAX.
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                ans[i][j] = Integer.MAX_VALUE;
     
        // For each cell
       for(int i=0;i<n;i++)
			for(int j=0;j<m;j++){
				
				for(int k=0;k<n;k++)	
					for(int l=0;l<m;l++){
						
						if(matrix[k][l]== 1)
						ans[i][j]=Math.min(ans[i][j],Math.abs(i-k) + Math.abs(j-l));
						
					}
				
			}
		
		return ans;
	}
}


Time Complexity: O(N2*M2). 
Space Complexity: O(1)


-----------------------------------------


public class Solution{
	static class matrix_element{
		int row;
		int col;
		matrix_element(int row, int col
			this.row=row;
			this.col=col;
		}
	}
	public int[][] printDistance(int [][] matrix){
		int n=matrix.length;
		int m=matrix[0].length;
		int [] ans= new int[n][m];
		
		Queue<matrix_element> queue= new LinkdedList<>();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(matrix[i][j]==1)
		         queue.add(new matrix_element(i,j)); 
		
		int queueSize=queue.size();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				int distance=0;
                int mini_distance=Integer.MAX_VALUE;
				if(matrix[i][j]==0)
                for(int k=0;k<queueSize;k++){
					matrix_element element=queue.poll();
					int row=element.row;
					int col=element.col;
					distance = Math.abs(row-i)+Math.abs(col-j);
					mini_distance=Math.min(mini_distance,distance);
					if(mini_distance==1){
						abs[i][j]=1;
						queue.add(new matrix_element(row,col));
						break;
					}
					queue.add(new matrix_element(row,col));
						
				}		
              ans[i][j]=mini_distance;				
			}
		}
		return ans;
	}
}
 
 
 Time Complexity: O(N*M). 
Space Complexity: O(1)