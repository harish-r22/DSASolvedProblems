//Longest Common Subsequence

public class Solution{

      public int longestCommonSubseq(String s1, String s2){
		  int n=s1.length;
		  int m=s2.length;
		  return longestCommonSubseqUtil(n-1,m-1, s1, s2)
	  }
	  
	  public int longestCommonSubseqUtil(int index1,int index2, String s1, String s2){
		  
		  if(index1< 0 || index2<0 ){
			  return 0;
		  }
		  if(s1.charAt(index1)==s2.charAt(index2)){
			  return 1+longestCommonSubseqUtil(index1-1, index2-1,s1,s2);
		  }
		  else{
		  return 0+Math.max(longestCommonSubseqUtil(index1, index2-1,s1,s2),longestCommonSubseqUtil(index1-1,index2,s1,s2));
		  }		  
		
	  }

}


--------------------------------------

public class Solution{

      public static int longestCommonSubseq(String s1, String s2){
		  int n=s1.length();
		  int m=s2.length();
		  int dp[][] = new int[n][m];
		  for(int [] row: dp){
			  Arrays.fill(row,-1);
		  }
		  return longestCommonSubseqUtil(n-1,m-1, s1, s2,dp)
	  }
	  
	  public static int longestCommonSubseqUtil(int index1,int index2, String s1, String s2, int [][] dp){
		  
		  if(index1< 0 || index2<0 ){
			  return 0;
		  }
		  if(dp[index1][index2]!=-1){
			  return dp[index1][index2];
		  }
		  if(s1.charAt(index1)==s2.charAt(index2)){
			  return 1+longestCommonSubseqUtil(index1-1, index2-1,s1,s2,dp);
		  }
		  else{
			  
		  return 0+Math.max(longestCommonSubseqUtil(index1, index2-1,s1,s2,dp),longestCommonSubseqUtil(index1-1,index2,s1,s2,dp));
		  
		  }		  
		
	  }

}

Time Complexity: O(N*M)

Reason: There are N*M states therefore at max ‘N*M’ new problems will be solved.
Space Complexity: O(N*M) + O(N+M)
-----------------------------------------

//right shifting an index1



import java.util.Arrays;
public class Solution {

	public static int lcs(String s1, String s2) {
		int n=s1.length();
          int m=s2.length();
        int [][] dp = new int[n+1][m+1];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
          return longestCommonSubseqUtil(n,m, s1, s2,dp);
    }
    public static int longestCommonSubseqUtil(int index1,int index2, String s1, String s2, int [][] dp){
          
          if(index1== 0 || index2==0 ){
              return 0;
          }
        if(dp[index1][index2]!=-1){
          return dp[index1][index2];            
        }
            
          if(s1.charAt(index1-1)==s2.charAt(index2-1)){
              return dp[index1][index2]= 1+longestCommonSubseqUtil(index1-1, index2-1,s1,s2,dp);
          }
          else{
          return dp[index1][index2]= 0+Math.max(longestCommonSubseqUtil(index1, index2-1,s1,s2,dp),longestCommonSubseqUtil(index1-1,index2,s1,s2,dp));
          }          
        
      }

}


-------------------------------------------------------

public class Solution{
	public static int lcs(String s1, String s2) {
		int n=s1.length();
          int m=s2.length();
        int [][] dp = new int[n+1][m+1];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
		
		for(int i=0;i<=n;i++){
			dp[i][0]=0;
		}
		
		for(int i=0;i<=m;i++){
			dp[0][i]=0;
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(s1.charAt(index1-1)==s2.charAt(index2-1)){
                   return dp[index1][index2]= 1+dp[index1-1][index2-1];
                 }
                else{
                return dp[index1][index2]= 0+Math.max(dp[index1][ index2-1],dp[index1-1][index2]);
                }  
			}
		}
        return dp[n][m];
    }
}


Time Complexity: O(N*M)

Reason: There are N*M states therefore at max ‘N*M’ new problems will be solved.
Space Complexity: O(N*M) 



----------------------------------------------------------


public class Solution{
	public static int lcs(String s1, String s2) {
		int n=s1.length();
          int m=s2.length();
        int [] prev = new int[m+1];
		Arrays.fill(prev,0);
        int curr[] = new int[m+1];
		Arrays.fill(curr,0);
		for(int index1=1;index1<=n;index1++){
			for(int index2=1;index2<=m;index2++){
				if(s1.charAt(index1-1)==s2.charAt(index2-1)){
                   return curr[index2]= 1+prev[index2-1];
                 }
                else{
                return curr[index2]= 0+Math.max(prev[ index2-1],prev[index2]);
                }  
			}
			prev=curr;
		}
        return prev[m];
    }
}

Time Complexity: O(N*M)

Reason: There are N*M states therefore at max ‘N*M’ new problems will be solved.
Space Complexity: O(m) 