//Wildcard string matching



class Solution{
    static boolean match(String wild, String pattern)
    {
       int n=wild.length();
       int m=pattern.length();
       int  [][] dp= new int[n][m];
       for(int row[]  : dp){
           Arrays.fill(row,-1);
       }
       return function(n-1,m-1,wild,pattern,dp) == 1 ? true :false;
    }
    
    public static int  function(int i , int j ,String wild, String pattern,int [][] dp){
     if(i < 0 && j<0)
        return 1;
    
     if(i< 0 && j>=0)
        return 0;
        
     if( i>=0 && j < 0){
         for(int ii=0; ii <= i ; ii++ ){
             if(wild.charAt(ii) !='*' )return 0;
         }
         return 1;
     }
     
     if(dp[i][j] !=-1){
         return dp[i][j];
     }
     
     if(wild.charAt(i)==pattern.charAt(j) || wild.charAt(i)=='?' )
           return dp[i][j]= function(i-1,j-1,wild,pattern,dp);
    else{
      if(wild.charAt(i)=='*')
         return dp[i][j]=(function(i-1,j,wild,pattern,dp)==1 
         || function (i,j-1,wild,pattern,dp) ==1 ) ? 1 :0;
    }
         return dp[i][j]=0;
     
    }
} 


time complexcity : o(n*m)
space complexcity : o(n*m) + o(n+m)