//Distinct Subsequences

public class Solution{
	public int distinctSubsequenceCount(String s1, String s2){
		int n=s1.length();
		int m=s.length();
		int [][] dp = new int[n][m];
		for(int [] row : dp){
			Arrays.fill(row,-1);
		}
		return distinctSubsequenceCountUtil(s1,s2,n-1,m-1,dp);
	}
	
	public int distinctSubsequenceCountUtil(String s1, String s2,int index1, int index2,int [][] dp){
		if(index2<0){
			return 1;
		}
		if(index1<0){
			return 0;
		}
		if(dp[index1][index2]!=-1)
        return dp[index1][index2];
	    
		if(s1.charAt(in)==s2.chatAt(index2)){
			int leaveone=distinctSubsequenceCountUtil(s1,s2,index1-1, index2-1,dp);
			int stay=distinctSubsequenceCountUtil(s1,s2,index1-1,index2,dp);
			
			return dp[index1][index2]=leaveone+stay;
		}else{
			return dp[index1][index2]=distinctSubsequenceCountUtil(s1,s2,index1-1,index2,dp);
		}
	}
}

------------------------------------------

public class Solution{
	public int distinctSubsequenceCount(String s1, String s2){
	    int n=s1.length();
		int m=s.length();
		int [][] dp = new int[n+1][m+1];
		for(int i=0;i<n+1;i++){
			dp[i][0]=1;
		}
		for(int i=0;i<m+1;i++){
			dp[0][i]=0;
		}
		
		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				if(s1.chatAt(i-1)==s2.chatAt(j-1)){
					 dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])
				}else{
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][m];
	}
}




---------------------------------------------------------