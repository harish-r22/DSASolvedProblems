//Set Matrix Zeroes

public class Solution{
	public void setZeros(int [][] matrix){
		int col0=1, m=matrix.length, n=matrix[0].length;
		int[] row=matrix.length;
		int [] col= matrix[0].length;
		for(int i=0;i<m;i++){
			for(int j=1;j<n;j++){
				if(matrix[i][j]==0){
					row[i]=col[j]=1;
				}
			}
		}
		for(int i=0;i<m;i++){
			for(j=1;j<n;j++){
				if(row[i] ==1||col[j]== 1){
					matrix[i][j]=0;
				}
			}
		}
	}
}


public class Solution{
	public void setZeros(int [][] matrix){
 int col0=1, row=matrix.length, cols=matrix[0].length;
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0)
                col0=0;
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                   matrix[i][0]=matrix[0][j]=0;   
                }
            }
        }
        
        for(int i=row-1;i>=0;i--){
            for(int j=cols-1;j>=1;j--){
                if( matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col0==0){
                matrix[i][0]=0;
            }
        }
	}
}