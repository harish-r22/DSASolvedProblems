// 0/1 Knapsack 

public class Solution{
	public static int knapsack(int [] wt, int [] val, int n , int W){
		int dp[][] = new int[n][W+1];
		for(int [] row: dp){
			Arrays.fill(row,-1);
		}
		return knapsack(wt,val,n-1,W, dp);
	}
	
	public static int (int [] wt, int [] val, int index,int weight, int [][] dp){
		if(index==0){
			if(wt[0]<=W)
				return val[0];
			else
				return 0;
		}
		if(dp[index][weight]!=-1){
			return dp[index][weight];
		}
		
		int notTaken=0+knapsack(wt, val, index-1, weight,dp);
		
		int taken=Integer.MIN_VALUE;
		if(wt[index]<=weight){
			taken=val[index]+knapsack(wt,val,index-1, weight-wt[index],dp);
		}
		
		return dp[index][weight]=Math.max(taken,notTaken);
	}
}


----------------------------------------------------------------------


public class Solution{
	
	public static int knapsack(int [] wt, int [] val, int n , int W){
		int dp[][] = new int[n][W+1];
		for(int i=wt[0];i<W;i++){
			dp[0][i]=val[0];
		}
		for(int index=1;index<n;index++){
			for(int weight=1;weight<W;weight++){
				int notTaken=0+dp[index-1][ weight];
		
		        int taken=Integer.MIN_VALUE;
		        if(wt[index]<=weight){
			        taken=val[index]+dp[index-1][ weight-wt[index]];
		        }
				dp[index][weight]=Math.max(taken,notTaken);
			}
		}
		
		return dp[index-1][W];
	}