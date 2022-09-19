//Zigzag (or diagonal) traversal of Matrix


//Diagonal traversal

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [] arr= new int [m*n];
        int row=0, col=0;
        int i=0;
        boolean up=true;
        while(row<m && col<n){
            if(up){
               while(row > 0 && col < n-1){
                   arr[i++]=mat[row][col];
                   row--;
                   col++;
               }
               arr[i++]=mat[row][col]; 
                if(col==n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while(row <m-1 && col >0 ){
                    arr[i++]=mat[row][col];
                        col--;
                        row++;
                }
                arr[i++]=mat[row][col];
                if(row ==m-1){
                    col++;
                }else{
                    row++;
                }
                
            }
            up=!up;
            
        }
        return arr;
    }
}



// 


public class Solution{
	public void diagonalOrder(int [][] matrix,int m, int n){
		for(int k=0;ik<m;i++){
			System.out.println(matrix[k][0] + "");
			int i=k-1;
			int j=1;
			while(isValid(i,j,m ,n)){
				System.out.println(matrix[i][j] + "");
				i--;
				j++;
			}
			System.out.print();
		}
		
		for(int k=1;k<n;k++){
			System.out.println(matrix[m-1][k]);
			int i=m-2;
			int j=k+1;
			while(isValid(i,j,m,n)){
				System.out.println(matrix[i][j] + "");
				i--;
				j++;
			}
			System.out.print();
		}
		
	}
	public boolean isValid(int row, int col,int m, int n){
		if(row<0 || row>=m || col> =n || col<0 ){
			return false;
		}
		return true;
	}
}


time compleity : o(r*c)
space compleity o(1)