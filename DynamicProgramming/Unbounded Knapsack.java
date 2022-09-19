//Unbounded Knapsack

public class SOlution{
	public static int unboundedKnapsack(int [] val, int [] wt, int W){
		int n=val.length;
		int dp[][]= new int[n][W+1];
		for(int[] row : dp){
			Arrays.fill(row,-1);
		}
		return unboundedKnapsackUtil(n-1,val,wt,W);
	}
	
	public static int unboundedKnapsackUtil(int index, int [] val, int [] wt, int W){
		if(index==0){
			return (int)(W/wt[0] * val[0] );
		}
		
		if(dp[index][W]!=-1){
			return dp[ind][W];
		}
		int nottaken=0+unboundedKnapsackUtil(index-1,val,wt,W);
		int taken =Integer.MIN_VALUE;
		if(wt[index]<=W){
			taken=val[index]+unboundedKnapsackUtil(index,val,wt,W-wt[index]);
		}
		return dp[index][W]=Math.max(taken,nottaken);
	}
}