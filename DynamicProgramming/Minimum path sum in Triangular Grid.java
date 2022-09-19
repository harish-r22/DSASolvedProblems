//Minimum path sum in Triangular Grid

public class Solution{
	public int minimumPathSum(int [][] matrix){
		return minimumPathSum(0,0,matrix);
	}
	
	public int minimumPathSum(int i , int j, int [][] triangle){
		if(i==triangle.length-1){
			return triangle[i][j];
		}
		
		int up =matrix[m][n] + minimumPathSum(i+1,n,triangle);
		int diagonal=matrix[m][n]+ minimumPathSum(i+1,j+1,triangle);
		
		return Math.min(up,left);
	}
}

public int minPathSumInTrianglegrid(int [][] triangle,int n){
	int dp[][]=new int[n][n];
    for(int row[]: dp)
    Arrays.fill(row,-1);
	return minPathSumInTrianglegrid(0,0,triangle,n,dp);
}

public int minPathSumInTrianglegrid(int i,int j, int[][] triangle,int n , int [][] dp){
	if(dp[i][j]!=-1)
       return dp[i][j];
	if(i==n-1){
		return triangle[i][j];
	}
	int down=triangle[i][j]+minPathSumInTrianglegrid(i+1,j,triangle,n,dp);
	int dg=triangle[i][j]+minPathSumInTrianglegrid(i+1,j+1,n,dp);
	return dp[i][j]=Math.min(dg,down);
}

// tabulation

public int minPathSumInTrianglegrid(int [][] triangle,int n){
	return minPathSumInTrianglegrid(triangle,n);
}

public int minPathSumInTrianglegrid( int[][] triangle,int n ){
	int [][] dp = new int[n][n];
	
	 for(int j=0;j<n;j++){
        dp[n-1][j] = triangle[n-1][j];
    }
	  for(int i=n-2;i>=0;i--){
		  for(int j=i;j>=0;j--){
	        int down=triangle[i][j]+dp[i+1][j];
	        int dg=triangle[i][j]+dp[i+1][j+1];
			dp[i][j]=Math.min(dg,down);
	  }
	}
	return dp[0][0];
}


// space optimization



public int minPathSumInTrianglegrid(int [][] triangle,int n){
	return minPathSumInTrianglegrid(triangle,n);
}

public int minPathSumInTrianglegrid( int[][] triangle,int n ){
	int front[] = new int[n];
     int cur[] = new int[n];
	
	 for(int j=0;j<n;j++){
        front[j] = triangle[n-1][j];
    }
	  for(int i=n-2;i>=0;i--){
		  for(int j=i;j>=0;j--){
	        int down=triangle[i][j]+front[j];
	        int dg=triangle[i][j]+front[j+1];
			cur[j]=Math.min(dg,down);
	  }
	  front=cur;
	}
	return front[0];
}