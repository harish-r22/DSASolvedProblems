//Spiral Matrix

public class Solution{
	public List<Integer> spriralMatrix(int [][] matrix){
		int m=matrix.length;
		int n=matrix[0].length;
		int i=0,k=0,l=0;
		List<Integer> list=new ArrayList<>();
		while(k<m && l< n){
			for(i=l;i<n;i++){
				list.add(matrix[k][i]);
			}
			k++;
			for(i=k ;i < m;i++){
				list.add(matrix[i][n-1]);
			}
			n--;
			if(k<m){
				for(i=n-1;i>=l;i--){
					list.add(matrix[m-1][i]);
				}
				m--;
				
			}
			if(l<n){
				for(i=m-1;i>=k;i--){
					list.add(matrix[i][0])
				}
				l++;
			}
		}
		return list;
	}
}