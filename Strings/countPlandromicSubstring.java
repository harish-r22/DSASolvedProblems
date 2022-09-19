//count plaindromic sustring

public int countPlandromicSubstring(String str){
	
	int n= str.length;
	int count=0;
	boolean [][] table= new boolean[n][n];
	for(int i=0;i<n;i++){
		table[i][i]=true;
		count++;
	}
	
	for(int i=0;i<n;i++){
		if(str.charAt(i)==str.charAt(i+1)){
			table[i][i+1]=true;
			maxLength=2;
			start=i;
			count++;
		}
	}
	
	for(int k=3;k<=n;k++){
		for(int i=0;i<n-k+1;i++){
			
			int j=i+k-1;
			if(str.charAt(i)==str.charAt(j) && table[i+1][j-1]){
				table[i][j]=true;
				count++;
			}
			
		}
	}
	return count;
}

time complexcity : o(n2)
space complexcity : o(n2)