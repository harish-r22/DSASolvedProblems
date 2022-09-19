//48. Rotate Image
public class RotateImage{
	public void rorate(int [][] matrix){
		int m=matrix.length;
		int n=matrix[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j]=temp;
				
			}
		}
	}
}