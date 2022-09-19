//Transform One String to Another using Minimum Number of Given Operation

public int minimumOperations(String s1,String s2){

int n= s1.length();
int m=s2.length();
return (n+m- 2* longestCommonSub(s1,s2));	
}

public int longestCommonSub(String s1, String s2){
	int n=s1.length;
	int m=s2.length;
	int [][] dp = new int [n+1][m+1];
	for(int [] r: dp){
		Arrays.fill(r,-1);
	}
	
	for(int i=0;i<=n;i++){
		dp[i][0]=0;
	}
		
	for(int j=0;j<=m;j++){
		dp[0][j]=0;
	}
	int ans=0
	 for(int i=1;i<=n;i++){
	   for(int j=1;j<=m;j++){
		   if(s1[index1]==s2[index2]){
		   dp[index1][index2]=1+ dp[index1-1][index2-1];
		   ans= Math.max(ans,dp[index1][index2]);
	       }else
	     dp[index1][index2]=0;
	   }
	 }
	
	return ans;
}