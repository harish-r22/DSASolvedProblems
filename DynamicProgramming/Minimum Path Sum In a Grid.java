//Minimum Path Sum In a Grid (DP 10)	


public class Solution{
	
	public int minimumPathSum(int [][] matrix){
		int m=matrix.length;
		int n=matrix[0].length;
		return minimumPathSum(m,n,matrix);
	}
	
	public int minimumPathSum(int m , int n, int [][] matrix){
		if(m==0 || n==0){
			return matrix[m][n];
		}
		if(m<0 || n< 0){
			return 1e9;
		}
		
		int up =matrix[m][n] + minimumPathSum(m-1,n,matrix);
		int left=matrix[m][n]+ minimumPathSum(m,n-1,matrix);
		
		return Math.min(up,left);
	}
}



public class Solution{
	
	public int minimumPathSum(int [][] matrix){
		int m=matrix.length;
		int n=matrix[0].length;
		int [][] dp= new int[m][n];
		for(int [] row : dp){
			Arrays.fill(row,-1);
		}
		return minimumPathSum(m,n,matrix,dp);
	}
	
	public int minimumPathSum(int m , int n, int [][] matrix, int[][] dp){
		if(dp[m][n]!=-1){
			return dp[m][n];
		}
		if(m==0 || n==0){
			return matrix[m][n];
		}
		if(m<0 || n< 0){
			return 1e9;
		}
		
		int up =matrix[m][n] + minimumPathSum(m-1,n,matrix);
		int left=matrix[m][n]+ minimumPathSum(m,n-1,matrix);
		
		return dp[m][n]=Math.min(up,left);
	}
}


time complexcity : o(n*m)
space complexcity : o(n*m) + 0(n+m)

--------------------------------------------
public class Solution{
	public int minimumPathSum(int [][] matrix){
		int m=matrix.length;
		int n=matrix[0].length;
		int [][] dp= new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==0 && j==0){
					return matrix[i][j]
				}else{
					int up=matrix[i][j];
					if(i>0){
						up + = dp[i-1][j];
					}
					else{
						up +=(int)Math.pow(10,9);
					}
                    int left=matrix[i][j];
                    if(j>0){
						left+=dp[i][j-1];
					}
                    else{
						left+=(int)Math.pow(10,9);
					}	
                 	dp[i][j]=Math.min(up,left);				
					}
				}
			}
			return dp[m-1][n-1];
		}
		
	}
	
	
time complexcity : o(n*m)
space complexcity : o(n*m) 
----------------------------------------------------


public class SOlution{
	
	static int minSumPath(int n, int m, int[][] matrix){
    
    int prev[] = new int[n];
    for(int i=0; i<n ; i++){
        int temp[] = new int[m];
        for(int j=0; j<m; j++){
            if(i==0 && j==0) temp[j] = matrix[i][j];
            else{
                
                int up = matrix[i][j];
                if(i>0) up += prev[j];
                else up += (int)Math.pow(10,9);
                
                int left = matrix[i][j];
                if(j>0) left+=temp[j-1];
                else left += (int)Math.pow(10,9);
                
                temp[j] = Math.min(up,left);
            }
        }
        prev=temp;
    }
    
    return prev[m-1];
}
}

time complexcity : o(n*m)
space complexcity : o(n) 